## π νμ λ° κ³΅μ§μ¬ν­

+ νλ‘μ νΈ μκ°λ₯Ό νλ©΄ κ°λ¨ν λ‘κ·ΈμΈ, νμκ°μ, κ³΅μ§μ¬ν­ CRUD μλλ€. 
+ νμ λ° κ³΅μ§μ¬ν­ κ°λ°ν μ΄μ λ κ²μν λ§λλ μμμ΄ μ€λ¬΄μ μ€μνκΈ° λλ¬Έμ νΌμ κ΅¬κΈλ§ ν΅ν΄μ Front-Endμ Back-End κ°μ΄ μ μ©νμ¬ νλμ κ°μΈνλ‘μ νΈλ₯Ό μμ± μν¬μ μμμ΅λλ€.
+ Fron-End λΆλΆμ Bootstap ννλ¦Ώμ μ΄μ©νμ¬, UI & UX λ§λ€μ μμκ³ , Back-End λΆλΆμ μλ Springframework μ¬μ©νλ©΄μ MyBatis λμ μΏΌλ¦¬λ‘ λΆνμν λ°λ³΅μ μΈ CRUD κ°λ°μ νμμ΅λλ€. JPAλ₯Ό μ μ©μ νμ¬ JpaRepository μΈν°νμ΄μ€μμ μ κ³΅ν΄μ£Όλ CRUD λ©μλ μ¬μ©νλ©΄μ κ°λ°μ μμ°μ±ν₯μκ³Ό μ½λμ μμ μ±μ λν΄μ μ°¨μ΄μ μ μ μ μμμ΅λλ€.
+ findAll() λ©μλμ μ‘°κ±΄λ¬Έμ΄ λ§μ λ³΅μ‘ν μΏΌλ¦¬μ κ²½μ° QueryDSL μ΄μ©νμ¬ κ°μ²΄μ§ν₯ μΏΌλ¦¬λ‘ κ°μ ν  μ μμμ΅λλ€. 

### κΈ°λ₯ μ€λͺ
+ JpaRepository μΈν°νμ΄μ€ CRUD λ©μλ μ΄μ©νμ¬ κ³΅μ§μ¬ν­ κΈ°λ₯ κ΅¬ν
+ QueryDSL κ°μ²΄μ§ν₯ μΏΌλ¦¬λ₯Ό νμ©νμ¬ κ²μμ‘°κ±΄ κ΅¬ν 
+ SpringSecurity λ‘κ·ΈμΈ μΈμ¦ κ΅¬ν
+ μ°κ΄κ΄κ³ μΌλμΌ λ§€ν μ μ©
### μ μκΈ°κ°, μ°Έμ¬μΈμ
+ μ μκΈ°κ°: 2022.06.03 ~ 2022.06.13
+ μ°Έμ¬μΈμ: κ°μΈνλ‘μ νΈ
### μ¬μ©κΈ°μ  (κΈ°μ μ€ν)
+ Java 11
+ SpringBoot 2.7.0
+ Spring Security
+ Spring Data JPA
+ QueryDSL 5.0.0
+ Gradle
+ MySQL
## μνμ€ λ€μ΄μ΄κ·Έλ¨


<img src="https://user-images.githubusercontent.com/58936137/180255278-533332c7-68ec-4a22-870a-d048ed842976.png" width="650px" height="400px">

<details>
<summary><b>λ‘κ·ΈμΈ μΈμ¦ λ€μ΄μ΄κ·Έλ¨</b></summary>
<div markdown="1">

<img src="https://user-images.githubusercontent.com/58936137/180148990-9afe9e28-c093-446a-8027-bfd80a024a6f.png" width="650px" height="400px">	

</div>
</details>	

<details>
<summary><b>κ²μν CRUD λ€μ΄μ΄κ·Έλ¨</b></summary>
<div markdown="1">

<img src="https://user-images.githubusercontent.com/58936137/180138887-78f34a31-a84e-40df-9c0a-bb425e7c22d7.png" width="650px" height="400px">

</div>
</details>

## ν΅μ¬ κΈ°λ₯
- QueryDsl νμ©νμ¬ μ¬λ¬ κ²μ μ‘°κ±΄μ ν΅ν΄μ κ°λ¨ν κ³΅μ§μ¬ν­ μ‘°ν μλΉμ€ μλλ€.</br>
- JpaRepository μΈν°νμ΄μ€ findAll() λ©μλλ μΏΌλ¦¬κ° λ³΅μ‘ν΄μ§ κ²½μ° QueryDsl νμ©νμ¬ JPQL κ°μ²΄μ§ν₯ μΏΌλ¦¬λ₯Ό ν΅ν΄μ μνλ μ‘°κ±΄λ¬Έμ μΆλ ₯ν  μ μμ΅λλ€.
<details>
<summary><b>QueryDsl μ€μ </b></summary>
<div markdown="1">
	
~~~java
buildscript {
	ext {
		queryDslVersion = "5.0.0"
	}
}

plugins {
	id 'org.springframework.boot' version '2.7.0'
	id 'io.spring.dependency-management' version '1.0.11.RELEASE'
	id 'java'
	id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"
}
~~~
- queryDslVersion = "5.0.0"
- id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"	
	
~~~java
dependencies {
	implementation 'org.springframework.security:spring-security-test'
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.springframework.boot:spring-boot-devtools'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5'
	compileOnly 'org.projectlombok:lombok'
	runtimeOnly 'com.h2database:h2-mvstore:1.4.199'
	runtimeOnly 'mysql:mysql-connector-java'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	implementation "com.querydsl:querydsl-jpa:${queryDslVersion}"
	implementation "com.querydsl:querydsl-apt:${queryDslVersion}"
	implementation 'org.springframework.boot:spring-boot-starter-oauth2-client'
}
~~~	
- implementation "com.querydsl:querydsl-jpa:${queryDslVersion}"
- implementation "com.querydsl:querydsl-apt:${queryDslVersion}"	
	
~~~java
// querydsl μΆκ° μμ
def querydslDir = "$buildDir/generated/querydsl"

querydsl {
	jpa = true
	querydslSourcesDir = querydslDir
}

sourceSets {
	main.java.srcDir querydslDir
}

configurations {
	compileOnly {
		extendsFrom annotationProcessor
	}
	querydsl.extendsFrom compileClasspath
}

compileQuerydsl {
	options.annotationProcessorPath = configurations.querydsl
}
// querydsl μΆκ° λ
~~~
</div>
</details>

<details>
<summary><b>QueryDsl μ¬μ©</b></summary>
<div markdown="1">
	
~~~java	
import com.food.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board,Long>, QuerydslPredicateExecutor<Board>,BoardRepositoryCustom {

    @Query("select b from Board b where b.id = :id")
    Board getBoardDtl(@Param("id") Long id);

    @Modifying
    @Query("update Board b set b.hit = b.hit + 1 where b.id = :id")
    int updateView(@Param("id") Long id);

}
~~~
- BoardRepositoryCustom μΈν°νμ΄μ€λ₯Ό μμμ λ°μΌλ©΄ JpaRepository μΈν°νμ΄μ€λ₯Ό μ¬μ©ν  μ μμ΅λλ€.  

~~~java
import com.food.dto.BoardSearchDto;
import com.food.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardRepositoryCustom {

    Page<Board> findAll(Pageable pageable, BoardSearchDto boardSearchDto);
}
~~~
- findAll() λ©μλ λ§€κ°λ³μμ BoardSearchDto μΆκ°ν©λλ€. 
~~~java

import com.food.dto.BoardSearchDto;
import com.food.entity.Board;
import com.food.entity.QBoard;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class BoardRepositoryCustomImpl implements BoardRepositoryCustom{
    private JPAQueryFactory queryFactory;

    public BoardRepositoryCustomImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }

    private BooleanExpression searchByLike(String searchBy, String searchQuery){

        if(StringUtils.equals("T",searchBy)){
            return QBoard.board.title.like("%" + searchQuery + "%");
        }else if(StringUtils.equals("C",searchBy)){
            return QBoard.board.content.like("%" + searchQuery + "%");
        }else if(StringUtils.equals("TC",searchBy)){
            return QBoard.board.title.like("%" + searchQuery + "%")
                    .or(QBoard.board.content.like("%" + searchQuery + "%"));
        }
        return null;
    }

    @Override
    public Page<Board> findAll(Pageable pageable, BoardSearchDto boardSearchDto) {
        QueryResults<Board> results = queryFactory
                .selectFrom(QBoard.board)
                .where(
                        searchByLike(boardSearchDto.getSearchBy(),
                                boardSearchDto.getSearchQuery())
                )
                .orderBy(QBoard.board.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();

        List<Board> content = results.getResults();
        long total = results.getTotal();
        return new PageImpl<>(content, pageable, total);
    }
}

~~~
- findAll() λ©μλ κ΅¬νλΆμ QueryDsl κ°μ²΄μ§ν₯μ μΈ μΏΌλ¦¬λ₯Ό ν΅ν΄μ μ¬λ¬ μ‘°κ±΄κ°μ λ£μ΄ μ‘°νν μ μμ΅λλ€.	
	
</div>
</details>

<details>
<summary><b>μ°κ΄ κ΄κ³ μΌλμΌ</b></summary>
<div markdown="1">

#### Member.java
~~~
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // No
~~~

#### Board.java
~~~
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
~~~


</div>
</details>

## ν΅μ¬ νΈλ¬λΈμν κ²½ν 

- κ°μ₯ κΈ°μ΅μ΄ λ¨μλ Errorλ Spring Security λ‘κ·ΈμΈ μΈμ¦ μ΄μμ΅λλ€.  
- λ‘κ·ΈμΈ νλ©΄μμ Email, Password νλΌλ―Έν° κ°μ SecurityConfig μμ κ°λ‘μ±μ μΈμ¦μ΄ μ±κ³΅μ΄ λλ©΄ .defaultSuccessUrl("/board/list") κ³΅μ§μ¬ν­ νμ΄μ§ νλ©΄μΌλ‘ λμ΄κ°μ§ μκ³   Spring Security 403 Forbidden Errorκ° λ°μλμμ΅λλ€.
   
<details>
<summary><b>κΈ°μ‘΄ μ½λ</b></summary>
<div markdown="1">

~~~java

import com.food.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired MemberService memberService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        
        http
                .formLogin()
                .loginPage("/members/login")
                .defaultSuccessUrl("/board/list")
                .usernameParameter("email")
                .failureUrl("/members/login/error")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/members/logout"))
                .logoutSuccessUrl("/members/login");

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
    }
}
~~~
~~~
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{/layouts/layout}">

<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="layout1.css" th:href="@{/css/layout1.css}" rel="stylesheet">
</head>


<div class="container">
	<h3>λ‘κ·ΈμΈ νμ΄μ§</h3>
	<a href="/members/project"><p>νμ κ°μ ν <br> λ‘κ·ΈμΈ νμλ©΄ κ³΅μ§μ¬ν­μΌλ‘ μ΄λ</p></a>
	<form role="form" method="post" action="/members/login">
		<div class="mb-3">
			<input type="email" name="email" class="form-control" id="email" placeholder="μ΄λ©μΌμ μλ ₯ν΄μ£ΌμΈμ">
		</div>
		<div class="mb-3">
			<input type="password" name="password" id="password" class="form-control" placeholder="λΉλ°λ²νΈ μλ ₯">
		</div>
		<p th:if="${loginErrorMsg}" class="error" th:text="${loginErrorMsg}"></p>
		<button class="btn btn-primary" id="login">λ‘κ·ΈμΈ</button>
		<button type="button" class="btn btn-danger" onClick="location.href='/members/new'" id="login-sign">νμκ°μ</button>
	</form>
</div>
</html>
~~~

</div>
</details>


<details>
<summary><b>κ°μ λ μ½λ</b></summary>
<div markdown="1">

~~~
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{/layouts/layout}">

<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="layout1.css" th:href="@{/css/layout1.css}" rel="stylesheet">
</head>


<div class="container">
	<h3>λ‘κ·ΈμΈ νμ΄μ§</h3>
	<a href="/members/project"><p>νμ κ°μ ν <br> λ‘κ·ΈμΈ νμλ©΄ κ³΅μ§μ¬ν­μΌλ‘ μ΄λ</p></a>
	<form role="form" method="post" action="/members/login">
		<div class="mb-3">
			<input type="email" name="email" class="form-control" id="email" placeholder="μ΄λ©μΌμ μλ ₯ν΄μ£ΌμΈμ">
		</div>
		<div class="mb-3">
			<input type="password" name="password" id="password" class="form-control" placeholder="λΉλ°λ²νΈ μλ ₯">
		</div>
		<p th:if="${loginErrorMsg}" class="error" th:text="${loginErrorMsg}"></p>
		<button class="btn btn-primary" id="login">λ‘κ·ΈμΈ</button>
		<button type="button" class="btn btn-danger" onClick="location.href='/members/new'" id="login-sign">νμκ°μ</button>
		<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}">
	</form>
</div>
</html>
~~~
### π‘ ν΄κ²°λ°©λ²
- λ°μ νλ¨μ input νκ·Έμ csrf.parameterName, csrf.token κ°μ λ£μ΄ μΆκ°νμ΅λλ€. 
- λ‘κ·ΈμΈ λ²νΌ ν΄λ¦­ ν λ΄μμ Έ μλ μΈμ μ λ³΄ κ°μ SecurityConfig μμ μΈμ¦ ν κ³΅μ§μ¬ν­ νμ΄μ§ νλ©΄μΌλ‘ μ λμ΄κ°λκ±Έ μ μ μμμ΅λλ€. 
</div>
</details>

### π κ°μΈ νλ‘μ νΈ λΈλ‘κ·Έ
+ <a href="https://pan2468.tistory.com/category/Toy%20Project/%ED%9A%8C%EC%9B%90%20%EB%B0%8F%20%EA%B3%B5%EC%A7%80%EC%82%AC%ED%95%AD">κ°μΈ νλ‘μ νΈ μ€λͺ</a>


