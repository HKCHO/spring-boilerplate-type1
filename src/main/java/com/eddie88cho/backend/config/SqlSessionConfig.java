package com.eddie88cho.backend.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

import static com.eddie88cho.backend.constants.AppConstants.*;

/**
 * SQL Session 설정 클래스
 *
 * 여기서는  mybatis의 SqlSession과 관련된 설정을 해볼꺼야
 */
@Configuration              // 스프링 설정 어노테이션을 잊지 말자고
@MapperScan(DAO_PACKAGE)    // SqlMapper 인터페이스를 스캔할 패키지명이야. AppConstants.DAO_PACKAGE에 선언되어있어
public class SqlSessionConfig {

    // SqlSessionFactory를 bean으로 만들어서 올려놓도록 하자
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();

        // 여기서 datasource는 현재 실행되고 있는 프로필에 설정된 database 정보로 생성되었어
        sessionFactoryBean.setDataSource(dataSource);

        // SQL Mapper xml파일의 위치를 알려주는거야
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_XML_LOCATION);
        sessionFactoryBean.setMapperLocations(mapperLocations);

        // SQL Mapper 안에서 사용되는 도메인들의 alias를 여기서 확인할꺼야
        sessionFactoryBean.setTypeAliasesPackage(TYPE_ALIAS_PACKAGE);

        SqlSessionFactory sessionFactory = sessionFactoryBean.getObject();
        assert sessionFactory != null;

        // database의 엔티티들이 underscore 형태로 이름이 지어져있다면, camelCase로 변수명을 찾아 생성|매핑 해줄꺼야
        // 예를 들어서 컬럼명이 'expired_dt'일 경우, mybatis는 expiredDt를 찾아서 생성|매핑 해줄꺼야
        sessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);

        return sessionFactory;
    }

}
