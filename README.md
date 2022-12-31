# Spring_Study 🍃

<h3>해당 레포지토리는 스프링 프로젝트 이전 Spring에 대한 기본 이론 및 실습을 통한 코드들이 모여있습니다🙂</h3>
<p>개인 블로그에 기록해놨던 공부내용들을 깃허브에 올렸기 때문에 <a href="https://blog.naver.com/mesudal">네이버 블로그</a>에서 좀 더 다양한 공부 기록들을 확인할 수 있습니다!</p>
<p>Spring의 경우 필기 내용이 그렇게 많지 않기 때문에 README.md 파일 하나로 정리하였습니다!</p>
<p>감사합니다!😊</p>

<hr>
<h2>Spring Boot, 프레임워크🍒</h2>
<h3>프레임워크란?</h3>
<ul>
  <li>뼈대나 근간을 이루는 코드들의 묶음.</li>
  <li>라이브러리의 덩치가 커지면 프레임워크가 된다.</li>
  <li>라이브러리란, 개발자가 작성해놓은 코드파일을 의미하며, API란, 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.</li>
  <li>프레임워크란, API가 굉장히 많이 모여져서 덩치가 커져있는 것을 의미한다.</li>
  <li>개발자는 각 개개인의 능력차이가 큰 직종이고, 개발자 구성에 따라 프로젝트 결과 역시 큰 차이를 낳는다. 이런 상황을 극복하기 위한 코드의 결과물이 바로 프레임워크이다.</li>
  <li>프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식으로 개발하게 된다.</li>
    <ul>
      <li>프레임워크의 장점</li>
      <ul>
        <li>개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 하더라도 반쯤 완성한 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.</li>
        <li>회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고, 개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기 때문에 개발 시간을 단축할 수 있다.</li>
      </ul>
    </ul>
</ul>



<h3>스프링 프레임워크란?</h3>
<ul>
  <li>경량 프레임워크(light-weight)이다.</li>
  <li>이전 프레임워크는 다양한 경우를 처리할 수 있는 다양한 기능을 가지도록 만들다보니 하나의 기능을 위해서 너무 많은 구조가 필요했다. 때문에 기술이 너무 복잡하고 방대했고, 전체를 이해하고 개발하기에는 어려움이 많았다. 이를 해결하기 위해 스프링 프레임워크가 등장했고, 특정 기능을 위주로 간단한 JAR 파일 등을 이용해서 모든 개발이 가능하도록 구성되어 있다.</li>
  <ul>
    <li>스프링 프레임워크의 장점</li>
    <ul>
      <li>복잡함에 반기를 들어서 만들어진 프레임워크(경량화)</li>
      <li>프로젝트 전체 구조를 설계할 때 유용한 프레임워크(서버 제작의 빠른 속도)</li>
      <li>다른 프레임워크들의 포용, 여러 프레임워크를 혼용해서 사용 가능하며 이를 접착성이라고 한다.</li>
      <li>개발 생산성과 개발도구의 지원</li>
    </ul>
  </ul>
</ul>



<h3>스프링 프레임워크의 특징</h3>
<ul>
  <li>POJO 기반의 구성</li>
    <ul>
      <li>POJO(Plain Old Java Object) 기반의 구성</li>
        <ul>
          <li>오래된 방식의 간단한 자바 객체라는 의미이며, JAVA 코드에서 일반적으로 객체를 구성하는 방식을 스프링 프레임워크에서 그대로 사용할 수 있다는 말이다.</li>
        </ul>
    </ul>
  <li>DI를 통한 객체간의 관계 구성</li>
    <ul>
      <li>DI(의존성 주입)를 통한 객체간의 관계 구성</li>
        <ul>
          <li>의존성(Dependency)이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것을 의미한다.</li>
          <li>예를 들어 A객체가 B객체 없이 동작이 불가능한 상황을 'A가 B에 의존적이다'라고 표현한다.</li>
          <li>주입(Injection)은 말그대로 외부에서 밀어넣는 것을 의미한다.</li>
          <li>예를 들어 어떤 객체가 필요로 하는 객체를 외부에서 밀어넣는 것을 의미한다.</li>
          <li>주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역할을 변하지 않는다.</li>
          <li>**의존성</li>
            <ul>
              <li>ⓐ→→→→→→→→→→→→→→→→→→→→→→→ⓑ</li>
              <li>ⓐ객체에서 ⓑ객체를 직접 생성</li>
            </ul>
          <li>**의존성 주입</li>
            <ul>
              <li>ⓐ→→→→→→→→→→???↔↔↔↔↔↔↔↔↔↔↔↔ⓑ</li>
              <li>ⓐ는 ⓑ가 필요하다는 신호를 보내고, ???가 ⓑ객체를 외부에서 생성하여 주입하게 된다.</li>
            </ul>
          <li>의존성 주입방식을 사용하기 위해서는 ???라는 존재가 필요하게 된다. 스프링 프레임워크에서는 ApplicationContext가 ???라는 존재이며, 필요한 객체들을 생성하고, 필요한 객체들을 주입해주는 역할을 한다. 따라서 갭라자들은 기존의 프로그래밍과 달리 객체와 객체를 분리해서 생성하고, 이러한 객체들을 엮는(wiring) 작업의 형태로 개발하게 된다.</li>
          <li>ApplicationContext가 관리하는 객체들을 빈(Bean)이라 부르고, 빈과 빈 사이의 의존 관계를 처리하는 방식으로는 XML, 어노테이션, JAVA 방식이 있다.</li>
        </ul>
    </ul>
  <li>AOP 지원</li>
    <ul>
      <li>AOP(Aspect Oriented Programming)의 지원</li>
        <ul>
          <li>관점 지향 프로그래밍.</li>
          <li>좋은 개발환경에서는 개발자나 비지니스 로직에만 집중할 수 있게 한다.</li>
          <li>스프링 프레임워크는 반복적인 코드를 제거해줌으로써 핵심 비지니스 로직에만 집중할 수 있는 방법을 제공한다.</li>
          <li>보안이나 로그, 트랜잭션, 예외처리와 같이 비지니스 로직은 아니지만, 반드시 처리가 필요한 부분을 횡단 관심사(cross-concern)라고 한다.</li>
          <li>스프링 프레임워크는 이러한 횡단 관심사를 분리해서 제작하는 것이 가능하고, 횡단 관심사를 모듈로 분리하는 프로그래밍을 AOP라고 한다. 핵심 비지니스 로직에만 집중하여 코드 개발이 가능해지고, 각 프로젝트마다 다른 관심사 적용 시 코드 수정을 최소화할 수 있으며, 원하는 관심사의 유지보수가 수월한 코드로 구성이 가능해진다.</li>
        </ul>
    </ul>
  
  
  <li>트랜잭션 관리</li>
    <ul>
      <li>AOP트랜잭션의 지원</li>
        <ul>
          <li>DB 작업 시 트랜잭션을 매번 상황에 맞게 코드로 작성하지 않고, 어노테이션이나 XML로 트랜잭션을 쉽게 관리할 수 있다.</li>
        </ul>
      <li>편리한 MVC 구조</li>
      <li>WAS에 종속적이지 않은 개발 환경</li>
        <ul>
          <li>단위 테스트</li>
          <ul>
            <li>전체 Application을 실행하지 않아도 기능별 단위 테스트가 용이하기 때문에 버그를 줄이고, 개발 시간을 단축할 수 있다.</li>
          </ul>
        </ul>
    </ul>
</ul>



<h3>스프링 부트란?</h3>
<ul>
  <li>스프링 프레임워크를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며, 시간이 너무 많이 걸리기 때문에 자동 설정(AutoConfiguration)과 개발에 필요한 모든 것을 관리해주는 스프링 부트를 선호한다. 각 코어 및 라이브러리의 버전들도 맞추어야 하지만 스프링 부트를 사용하면 이러한 복잡성을 해결하기에도 좋다.</li>
</ul>



<h3>프로젝트의 기본 경로</h3>
<ul>
  <li>src/main/java : 서버단 JAVA 파일</li>
  <li>test/main/java : 단위 테스트 JAVA 파일</li>
  <li>src/main/resources : 설정 파일 및 뷰단</li>
  <li>resources/static : css, js 파일 경로</li>
  <li>resources/templates : html 파일 경로</li>
  <li>pom.xml : 라이브러리 의존성 관리</li>
  <li>application.properties : 서버 및 DB 설정 파일</li>
</ul>


<hr>

<h2>Spring MVC에 대한 기본 개념📖</h2>
<h3>Spring MVC는 MVC모델과 어떤 차이가 있을까?</h3>
<ul>
  <li>Spring MVC는 이전에 Java, JSP에서 배웠던 MVC 모델과는 또 다른 점을 가지고 있다.</li>
  <li>JSP에서 진행되었던 MVC 2 모델과는 유사하지만, 사용자의 요청과 처리하는 방법이 살짝 다르고, 역할군들이 살짝씩 다르니 아래 그림을 참고해보자.</li>
  <img src = "https://postfiles.pstatic.net/MjAyMjExMDJfODcg/MDAxNjY3MzM2MTYyNDYy.l_z1jp9dlEooKfL0fHlhjqF-XvYdfWnE8J26GYaZcUEg.BBaFO_kgxsZP64Vsm46hy9b-4CL8VAijAORfLXr2ubYg.PNG.mesudal/FrontController-Pattern.png?type=w773">
  <li>위 그림을 보게 되면 각 번호에 따라 요청→응답까지 진행되게 된다.</li>
  <ul>
    <li>1.사용자로부터 요청을 받으면 Dispatcher Servlet으로 해당 요청을 보낸다.</li>
    <li>2.Dispatcher Servlet으로 들어온 요청은 HandlerMapping을 통해 요청에 따른 경로를 찾는다.</li>
    <li>3.HandlerMapping에서 찾은 경로를 다시 Dispatcher Servlet에게 알려준다.</li>
    <li>4.Dispactcher Servlet에서 받은 경로를 통해 HandlerAdapter는 경로에 맞는 Controller를 실행할 수 있도록 한다.</li>
    <li>5.HandlerAdapter는 경로에 해당하는 Controller에게 요청을 보내준다.</li>
    <li>6.Controller는 요청에 맞는 메소드를 실행하고, ViewResoulve에서는 결과를 어느 html로 보낼 것인지 View에게 알려준다.</li>
    <li>7.View는 요청에 대한 응답 결과를 받아서, 해당 결과를 Dispatcher Servlet에게 알려준다.</li>
    <li>8.Dispatcher Servlet은 View에서 받은 결과를 받은 후, Resp로 보낸다.</li>
    <li>9.최종적으로 요청에 대한 결과를 출력한다.</li>
  </ul>
</ul>


<h3>Spring MVC 패턴의 특징</h3>
<ul>
  <li>HttpServletRequest, HttpServletResponse를 거의 사용할 필요없이 기능 구현</li>
  <li>다양한 타입의 파라미터 처리, 다양한 타입의 리턴 타입 사용 가능</li>
  <li>GET 방식, POST 방식 등 전송 방식에 대한 처리를 어노테이션으로 처리 가능</li>
  <li>상속/인터펭이스 방식 대신 어노테이션으로만 설정 가능</li>
</ul>



<h3>어노테이션 정리</h3>
<ul>
  <li>가장 상위 경로 @RequestMapping("/ex/*")</li>
  <ul><li>URL 경로가 /ex/...인 경우 다 해당 컨트롤러로 들어온다. (확장자 필요x)</li></ul>
  <li>*에 들어갈 경로 @RequestMapping("ex01")</li>
  <ul><li>/ex/ex01 경로에 접근 시 실행될 메소드</li></ul>
  <li>만약 메소드 내에서 경로 접근 후 바로 이동을 하고 싶다면 아래와 같이 코드 작성</li>
  <pre><code>
  public String ex01() {
    return "ex02"; // RequestMapping이 "ex02"인 html 혹은 경로를 찾아서 이동
  }
  </code></pre>
</ul>


<hr>
<h2>tier, 스프링 프로젝트 계층📈</h2>

<h3>3-tier</h3>
<ul>
  <li>스프링 프로젝트는 3-tier 방식으로 구성한다.</li>
  <ul>
    <li>[Presentation Tier - 화면 계층]</li>
      <ul>
        <li>화면에 보여주는 기술을 사용하는 영역</li>
        <li>컨트롤러에서 사용자의 요청에 맞는 응답처리를 진행하며, HTML엔진(Thymeleaf), HTML 등이 담당하는 영역이다.</li>
        <li>화면이 구성이 이에 속한다.</li>
      </ul>
    <li>[Business Tier - 비지니스 계층]</li>
      <ul>
        <li>순수한 비지니스 로직을 담고 있는 영역.</li>
        <li>고객이 원하는 요구사항을 반영하는 계층이기 때문에 서비스에 있어서 가장 중요한 영역이다.</li>
        <li>이 영역의 설계는 고객의 요구 사항과 정확히 일치해야 하며, 서비스 영역이다.</li>
        <li>기능의 중심을 담당하는 영역</li>
      </ul>
    <li>[Persistence Tier - 영속 계층 혹은 데이터 계층]</li>
      <ul>
        <li>데이터를 어떤 방식으로 보관하고, 사용하는 가에 대한 설계가 들어가는 계층.</li>
        <li>일반적으로 DBMS를 많이 이용하지만, 상황에 따라서 네트워크 호출 혹은 원격호출 등의 기술이 접목될 수 있다.</li>
      </ul>
  </ul>
  <li>각 영역은 독립적으로 설계되어 나중에 특정한 기술이 변하더라도 필요한 부분을 전자제품으ㅟ 부품처럼 쉽게 교환할 수 있게 하자는 방식(모듈화)이다. 각 연결 부위는 인터페이스를 이용해서 설계하는 것이 일반적인 구성 방식이다.</li>
  
  <div align="center">
    <img src="https://postfiles.pstatic.net/MjAyMjEyMzFfMTYg/MDAxNjcyNDgzMjczNTYx.zn83fpSJ-2jpp7wkk4XpFIdS0uKlEkmgAg_bpxn8dp0g.K7y-UU7-vm5PMcod4QdqaX68usualFefU9DKSwWYnoQg.PNG.mesudal/image.png?type=w773">
  </div>
</ul>

<h3>Business 계층</h3>
<ul>
  <li>Presentation 계층과 영속 계층의 중간 다리 역할을 한다.</li>
  <li>영속 계층은 DBMS를 기준으로, 비지니스 계층은 로직을 기준으로 처리한다.</li>
  <li>예를 들어 쇼핑몰에서 상품 구매 시 포인트 적립을 한다고 가정한다면, 영속 계층의 설계는 '상품', '회원'으로 나누어 설계하지만, 비지니스 계층은 상품 영역과 회원의 영역을 동시에 사용해서 하나의 로직을 처리하게 된다.</li>
  <li>이 때 하나의 서비스에 필요한 쿼리  메소드를 하나로 묶어주는 역할이 필요한데, 이를 Service 객체로 사용한다.</li>
  <li></li>
  <li></li>
  <li></li>
  <li></li>
</ul>

<hr>

<h2>AOP(Aspect Oriented Programming)🔰</h2>

<h3>AOP</h3>
<ul>
  <li>관점이란 개발에 있어서, 관심사(Concern)를 의미한다.</li>
  <li>코드의 중복을 줄일 수 있으며, 핵심 로직과 주변 로직을 분리하여 관리할 수 있다.</li>
  <ul>
    <li>파라미터가 잘 전달 되었는가?</li>
    <li>이 로직에서 발생할 수 있는 모든 예외 처리</li>
  </ul>
  <li>핵심 로직은 아니지만 반복적으로 개발에 필요한 관심사들을 주변 로직이라고 한다.</li>
  <li>따라서 AOP는 이러한 주변 로직을 횡단 관심사로 분리항여 작성하고, 핵심 비지니스 로직만을 작성하도록 한다.</li>
  <li>즉, 반복적으로 나타나는 횡단 관심사를 모듈로 분리한 후 적절한  시점에 로직을 주입하는 것이 AOP이다. 스프링에서는 별도의 복잡한 설정  없이 간편하게 AOP의 기능들을 구현할 수 있기 때문에 중요한 특징 중 하나이다.</li>
</ul>


<h3>AOP를 사용할  수 있는 시점</h3>
<ul>
  <li>Around(전 구역)</li>
  <li>Before(메소드  시작 직후=시작되자마자)</li>
  <li>After(메소드 종료 직전=끝날 때(리턴하기 전))</li>
  <li>AfterReturning(메소드 리턴 후=끝난 후(리턴하고 나서))</li>
  <li>AfterThrowing(메소드 예외 발생 후)</li>
</ul>


<h3>AOP 설계 순서</h3>
<ul>
  <li>구현할 횡단 관심사를 의미할 수 있는 어노테이션 만들기</li>
  <li>어노테이션을 AOP로 등록하기</li>
  <li>종단 관심사에 등록된 어노테이션 사용하기</li>
</ul>


<hr>
<h2>JPA🔴</h2>

<h3>ORM(Object Relational Mapping)</h3>
<ul>
  <li>객체 진영과 RDB 진영을 자동으로 매핑하여 구조의 불일치를 개발자 대신 해결해주는 기술의 총칭이다.</li>
  <li>객체지향 구조에서 프로그래밍 언어를 사용하여 RDB의 데이터를 조작하는 방법이다.</li>
  <li>ORM을 사용하면 개발자가 SQL문을 직접 작성하지 않아도 RDB와 상호작용 할 수 있다.</li>
</ul>


<h3>JPA(Java Persistence API)</h3>
<ul>
  <li>ORM을 사용하기 위한 설계도(틀)이다.</li>
  <li>Java Application용 RDB 매핑  관리를 위한 인터페이스이며, DBMS 벤더사에 의존하지 않고 독립적으로 ORM을 사용할 수 있는 ORM 표준이다.</li>
  <li>인터페이스이기 때문에 구현되어 있지 않은 틀만 제공하며, 자체적인 작업을 수행하지 않는다.</li>
  <li>JPA에 설계된 구조에 맞춰서 각 메소드를 재정의하여 직접 ORM을 구현하여 사용해야 한다.</li>
  <li>JPA는 ORM을 사용할 수 있는 JAVA 인터페이스를 제공하는 ORM 접근 방식이며, 구현되지 않은 JPA를 ORM이라고 말하기는 어렵다.</li>
</ul>


<h3>Hibernate Framework</h3>
<ul>
  <li>모든 Java Application에 대해 객체 관계를 그대로 유지한 채 쿼리 서비스를 제공하는 오픈 소스(비용 없이 공개적으로 사용가능)의 경량 ORM이다.</li>
  <li>JPA를 구현한 구현체이며, 여러 구현체 중 가장 대표적인 구현체이다.</li>
  <li>객체 간 관계 구성을 지원하며, 상속, 지연성, 페이징 처리, 예외 처리 불필요를 지원한다.</li>
  <li>예외 처리 불필요란, JPA만의 독자적인 예외를 생성하여 try carch 및 throws를 강제시키지 않고 트랜잭션을 지원하는 Spring Framwork가 추상화한 예외로 변환시켜 커밋하지 않고 롤백시키도록 해준다.</li>
</ul>



<h3>Spring Data JPA</h3>
<ul>
  <li>Entity의 역할과 어노테이션 종류</li>
  <ul>
    <li>Entity의 역할은 DB 테이블과 컬럼들을 자바에서 객체로 매핑하여 사용할 수 있게끔 한다.</li>
    <li>@Entity : DB에서 영속적으로 저장된 데이터를 자바 객체로 매핑하여, 인스턴스 형태로 존재하는 데이터</li>
    <li>@Table(name = '테이블명') : 해당 이름을 가진 테이블을 만들 때</li>
    <li>@Id : JPA에서는 pk를 member_number 이런 형식이 아닌 member_id로 사용한다.</li>
    <li>@GeneratedValue : pk값이 자동적으로 증가하며, DB에서는 auto increment와 같은 역할을 한다.</li>
    <li>@Column(name = '컬럼이름', unique = true) : 필요시에 따라 변경하고 싶은 컬럼의 이름을 설정할 수 있다.</li>
    <li>@Enumrated(EnumType.STRING) : ENUM을 사용할 때, 만약 ENUM 타입이 문자열인 경우 꼭! 해당 어노테이션을 설정하여야 DB에 정상적으로 ENUM 값으로 들어가게 된다.</li>
    <li>@NoArgsConstructor(access = AccessLevel.PROTECTED) : 기본 생성자를 자식에서만 쓸 수 있게끔 만들어준다.</li>
  </ul>
  <li>Entity의 역할과 어노테이션 종류</li>
    <ul>
      <li>Enum은 상수의 집합으로 보면 되고, 역할은 타입을 미리 작성해놓고 때에 따라 객체에서 Enum으로 설정된 Type을 사용하면 된다.</li>
    </ul>
  <li>Entity의 역할과 어노테이션 종류</li>
    <ul>
      <li>Test에서는 DB와 자바에서의 목적에 맞는 쿼리문 혹은 동작이 잘 되는지 확인할 때 사용된다.</li>
      <li>@Transactional : 트랜잭션에 대한 환경을 구축해주기 때문에 begin과 commit을 쓰지 않아도, 해당 역할을 대신 해준다.</li>
      <li>@Rollback(false) : 단위테스트에서만 사용이 가능하며, 해당 메소드에 문제가 없는 경우 자동적으로 초기상태(=이전상태)로 Rollback을 하기 때문에 false 옵션을 주어 롤백이 되지 않고 DB에 값이 들어가도록 설정한다.</li>
    </ul>
</ul>
