package com.board.pra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//프로젝트명 + Application 파일
//스프링 부트의 시작을 담당하는 파일
//@SpringBootApplication : 스프링 부트의 설정을 관리하는 어노테이션
@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
