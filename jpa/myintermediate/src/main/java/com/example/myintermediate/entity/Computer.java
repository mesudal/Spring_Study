package com.example.myintermediate.entity;

import com.example.myintermediate.type.Hardware;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "ELECTRONIC_DEVICE")
@Table(name = "TBL_COMPUTER")
@Getter @Setter @ToString
@NoArgsConstructor
public class Computer extends Period{
    @Id @GeneratedValue
    @Column(name = "COMPUTER_ID")
    private Long computerId;
    @Column(name = "COMPUTER_SCREEN")
    private int computerScreen;
    @Column(name = "COMPUTER_BRAND")
    private String computerBrand;
    @Column(name = "COMPUTER_NAME")
    private String computerName;
    @Column(name = "COMPUTER_PRICE")
    private int computerPrice;
    @Column(name = "COMPUTER_RELEASE_DATE")
    private LocalDateTime computerReleaseDate;
    @Embedded // 모듈을 사용할 때 작성한다.
    private Hardware hardware;


    public void create(int computerScreen, String computerBrand, String computerName, int computerPrice, LocalDateTime computerReleaseDate, Hardware hardware) {
        this.computerScreen = computerScreen;
        this.computerBrand = computerBrand;
        this.computerName = computerName;
        this.computerPrice = computerPrice;
        this.computerReleaseDate = computerReleaseDate;
        this.hardware = hardware;
    }
}
