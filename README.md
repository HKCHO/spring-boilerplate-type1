# spring-boilerplate-type1
스프링 보일러플레이트 타입1

백엔드 구조 생성시 자주 쓰는 구조 보일러플레이트로 만듬

---

spring boot

gradle
[package] war

lombok

mybatis
  - MySQL 계열로 세팅
     - mariadb
     - mysql
     - h2
 
redis
  - 로컬 개발시 local embeded로 돌아갈 수 있도록 프로필 나눔
  - Spring Session관리할 때 쓸 예정
      - 시스템 관리자가 맘에 안드는 관리자 즉시 로그아웃 시킬 수 있음
  
security
  - `UserDetails`를 활용한 `User`클래스로 Database에서 가져오 사용자 정보를 `Principal`로 사용
  - RoleHierarchy는 database table에서 관리하도록
  
actuator
  - Health 체크용
  - 기본 Server health 세팅만 해놓을 것
  - 서버 문제 발생시 URL로 health check 가능하도록
  
tiles + jsp
  - 유지보수 가능한 개발자 많음
  - security jsp tag 사용
  
spring profiles : 프로필별 세팅을 미리 갖춰놓고 다음번에 작업할 때 시간을 줄이자
  - local : 개발자 로컬개발환경
  - dev   : 개발서버 배포용
  - stage : 스테이지(품질/알파/시험) 서버 배포용
  - prod  : 운영(실) 서버 배포용
  - svr-{d} : on-premise에서 서버번호를 두고 사용하는 고객님을 위한 서버별 프로필 분기
  - redis : 로컬환경에 redis설치 귀찮을 때
  
    

---
  
[이 보일러플레이트의 장점]
 - 유지보수비용 적음
    - 고객이 낮은 유지보수 비용을 바랄경우
    - 개발자 구하기 쉬움 (tiles, jsp, mybatis, mysql계열 database)
    
 - 전자정부프레임워크로 migration 쉬움
 
[이 보일러플레이트의 단점]
 - 존재 자체
 - 구림
