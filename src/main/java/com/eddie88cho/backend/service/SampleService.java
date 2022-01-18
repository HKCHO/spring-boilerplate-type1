package com.eddie88cho.backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 서비스 클래스 예제야
 *  - 이 서비스 클래스는 Facade pattern을 적용하지 않았어.
 *  - 공통적인 서비스 정의가 필요하지 않다면 Facade 패턴을 사용하지 않고 직접 여기서 바로 기능을 구현하면 돼
 */
@Service    // Spring Service 어노테이션을 걸어놓으면 알아서 Spring bean으로 만들어줘, 네이밍은 클래스 첫글자가 lowercase로 변해서 들어갈꺼야.
@Slf4j      // Lombok의 slf4j logger생성 어노테이션이야. compile 레벨에서 LoggerFactory를 통해 log 변수를 만들어줘
public class SampleService {
    int myExGirlfriendsCount() {
        log.trace("'log'를 선언하지 않았지만 나는 log를 사용하고 있어.");
        log.debug("왜냐면 @Slf4j 어노테이션이 지금 이 클래스에 log 변수를 선언해줬기 때문이지");
        log.info("개발환경에서 Class Structure를 보면 private Logger log = org.slf4j.LoggerFactory.getLogger(\"this.getClass().getSimpleName()\"); 이 있을꺼야");
        log.warn("참고로 개발자가 log에 6가지 레벨을 모르면 안돼");
        log.error("로그를 아끼지 않고 박아넣는 개발자가 되도록 하자");
        if( log.isDebugEnabled() ) {
            log.debug("로그레벨 debug가 on이 되어있는 상황이면 이 안에 있는 친구들이 동작할꺼야");
            System.out.println("############################# 로그레벨이 'debug'입니다!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return 0;
    }
}
