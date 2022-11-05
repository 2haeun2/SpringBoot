package com.board.pra;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/hello")//url
	@ResponseBody//응답 페이지
	public String sayhi() {
		//return문자를 수정했지만 페이지상의 내용은 변경되지 않았다,
		//-로컬 was가 변경된 클래스를 리로딩 하지 않았음
		return"진짜 집에 가고 싶다";//jsp 파일을 요청헸는데/@ResponseBody는 언제 쓰이는가?
	}
	//Lombok(롬복)
	//자바클래스에 getter,setter,생성자 등을 자동으로 만들어주는 도구(dto)
	//깔끔한 소스코드를 만들 수 있다.(단점: 갑자기 적용이 안되는 오류가 있긴 함)
	
}
