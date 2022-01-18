package com.eddie88cho.backend.service.implemation;

import com.eddie88cho.backend.service.SampleFacadeService;
import org.springframework.stereotype.Service;

/**
 * 'SampleFacadeService' 서비스 정의 인터페이스에서 정의한 기능을 구현하는 클래스야
 *
 * 고객마다 부르는 이름이 달라
 *  - 구현 클래스
 *  - 구상 클래스
 *  - 구체 클래스
 *  - 콘크리트(Concrete) 클래스
 *  - 서비스 구현부
 * 등 별명이 서너개야
 */
@Service("adminSampleFacadeService")
public class AdminSampleFacadeService implements SampleFacadeService {
    @Override
    public String sayYourName(String name) {
        return "admin";
    }
}
