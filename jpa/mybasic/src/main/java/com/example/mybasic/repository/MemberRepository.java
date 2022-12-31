package com.example.mybasic.repository;

import com.example.mybasic.domain.entity.Member;
import com.example.mybasic.type.MemberType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Query method: Spring-Data-JPA에서 정해놓은 메소드의 이름으로 선언하면 자동으로 구현체를 주입하여 쿼리를 실행해준다.
// find[조회할 필드명 또는 아무거나]By[Where절에 들어갈 조건 필드명] : 조회할 필드명을 생략하면 전체 조회
// count[조회할 필드명 또는 아무거나]By[Where절에 들어갈 조건 필드명] : 개수 조회
// exist[조회할 필드명 또는 아무거나]By[Where절에 들어갈 조건 필드명] : boolean 타입으로 유무 검사
// delete[조회할 필드명 또는 아무거나]By[Where절에 들어갈 조건 필드명] : 삭제
public interface MemberRepository extends JpaRepository<Member, Long> {
    //jparepository는 인터페이스, 구현체가 따로 있음.
    //제네릭에 어떤 엔티티를 엮을 것인지, id가 무슨 타입인지 알려줘야 함. 1차 캐시에 등록해야 하니까. >> 구현이 다 되었음.
    //우리가 직접 entitymanager를 쓰지 않음.

    //쿼리메소드
    public List<Member> findByMemberNameContaining(String memberName);
    public List<Member> findByMemberNameStartingWith(String memberName);
    public List<Member> findByMemberNameEndingWith(String memberName);
    public List<Member> findByMemberNameLike(String memberName);

//    @Query
//    쿼리 메소드만 사용하면 메소드명이 너무 길어질 수 있기 때문에 @Query를 사용하여 원하는 쿼리를 JPQL로 작성하여 해결할 수 있다.
//    오타 혹은 문법에 오류가 있을 경우 컴파일 시 정확히 어떤 것이 오류인지가 콘솔에 정확히 나온다.

//    Parameter Binding
//    이름 기반 : JSQL에서 ":[파라미터명]"을 사용하면 매개변수 앞에 @Param([파라미터])를 작성하여 매핑해준다.
    @Query("select m from Member m where m.memberName like :keyword")
    public List<Member> find(@Param("keyword") String keyword);

    @Query("select m from Member m where m.memberType = :memberType and m.memberAge > :memberAge")
    public List<Member> findMemberByMemberAge(@Param("memberType") Enum<MemberType> memberType, int memberAge);

    @Query("select m from Member m where m.memberName in :memberNames")
    public List<Member> findMemberByNames(List<String> memberNames);

    @Modifying(clearAutomatically = true) //수정할 때 꼭 붙어야 하는 어노테이션!, 직접 클리어할 필요 없음.
    @Query("update Member m set m.memberAge = m.memberAge - 1 where m.memberAge > :memberAge")//디폴트가 executequery
    public int updateByName(int memberAge);

    @Modifying(clearAutomatically = true)
    @Query("delete from Member m where m.memberAge > :memberAge")
    public int deleteByMemberAge(int memberAge);

}
