package com.eddie88cho.backend.constants;

/**
 * 어플리케이션 상수
 */
public class AppConstants {
    // 지금 프로젝트의 루트 패키지명이야
    public static final String DEFAULT_PACKAGE      = "com.eddie88cho.backend";

    // 정확히는 mapper로 이름짓는게 맞아. 하지만 직관적으로 찾기 쉽게 dao라고 이름지었어
    public static final String DAO_PACKAGE          = DEFAULT_PACKAGE + ".dao";
    // Alias를 일일히 설정할 필요 없이 도메인 클래스에 달아놓을꺼야
    // 그러러면 Mybatis에 @Alias 어노테이션이 달려있는 도메인 클래스들을 모아놓은 패키지명을 알려줘야해
    public static final String TYPE_ALIAS_PACKAGE   = DEFAULT_PACKAGE + ".domain";

    // SQL문을 정의해놓은 xml들의 LOCATION PATTERN이야.
    // mybatis는 여기서 sql mapper들을 찾을꺼야
    public static final String MAPPER_XML_LOCATION  = "classpath:mapper/**/*Mapper.xml";
}
