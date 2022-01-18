package com.eddie88cho.backend.service.implemation;

import com.eddie88cho.backend.service.SampleFacadeService;
import org.springframework.stereotype.Service;

/**
 * 'SampleFacadeService' 서비스 정의 인터페이스에서 정의한 기능을 구현하는 클래스야
 *
 * 호출 시점에서 Spring Security의 role 또는 authority라던가 여러가지 조건에 따라서 구현 서비스를 다르게 불러올 수 있어
 */
@Service
public class ManagerSampleFacadeService implements SampleFacadeService {
    @Override
    public String sayYourName(String name) {
        return "manager";
    }
}
