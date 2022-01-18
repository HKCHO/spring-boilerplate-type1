package com.eddie88cho.backend.service;

/**
 * Facade 패턴을 사용한 서비스 정의 인터페이스야.
 * 아래에 선언해둔 메서드로 재사용이 필요하거나 반드시 구현해야하는 기능을 정의할 수 있어.
 * 퍼싸드 패턴으로 서비스를 설계하는 것은 AA의 역량의 척도가 될 수 있으니까 설계할 때 잘 하도록 하자.
 */
public interface SampleFacadeService {
    String sayYourName(String name);
}
