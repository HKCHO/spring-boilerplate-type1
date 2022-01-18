package com.eddie88cho.backend.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * 샘플 도메인 클래스야
 * DTO 역할을 하게 할꺼야
 */
@Alias("sample")    // Mybatis alias 어노테이션이야. sql mapper에서 'sample'로 그대로 쓰면돼. 소문자로 시작하는 것을 잊지 말자
@Getter // Lombok 'Getter' 어노테이션이야, 필드에 private 접근제어자로 생성된 변수에 대해서 'Getter' 메서드를 compile 레벨에서 만들어줘
@Setter // Lombok 'Setter' 어노테이션이야, 필드에 private 접근제어자로 생성된 변수에 대해서 'Setter' 메서드를 compile 레벨에서 만들어줘
@RequiredArgsConstructor    // Lombok의 의존성 주입 어노테이션이야, 의존성이 있는 Bean을 생성자 아규먼트로 compile 레벨에서 만들어줘
public class Sample {

    /*
     * Lombok의 @Getter, @Setter가 get/set 메서드를 만들어줄꺼야
     * 인텔리제이의 'Structur' 또는 이클립스에 'Class outline'을 보면 getter/setter가 public으로 생성되어 있어
     */
    private String sampleFieldVariable;

//    @Setter(AccessLevel.PRIVATE)      // Setter의 접근제어자를 private로 만들어줘
//    @Setter(AccessLevel.NONE)         // Setter를 만들고 싶지 않을 때 만들어줘
//    @Setter(AccessLevel.PACKAGE)      // Setter의 접근제어자를 package로 만들어줘
    @Setter(AccessLevel.PROTECTED)    // Setter의 접근제어자를 protected로 만들어줘
    private String accessPrivate;

    /*
     * transient는 데이터의 직렬화(Serialize)를 제외해
     * 보통 보안/민감 데이터가 Client side로 넘어가지 않도록 하고 싶을 때 사용하지
     * 그 외에도 이 클래스를 직렬화 하는 과정이 있을 때는, 이 필드는 직렬화에서 제외될꺼야.
     */
    private transient String transientVariable;
}
