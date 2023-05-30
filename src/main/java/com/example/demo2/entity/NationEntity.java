package com.example.demo2.entity;

import javax.persistence.*;

@Entity //테이블을 자바 객체화
@Table(name = "nation_table") // table 이름 지정
public class NationEntity {
    @Id // pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 적용
    private Long id;

    // column 추가
    @Column(length = 50, nullable = false, unique = true)
    private String nationName;

    @Column
    private int population;

}
