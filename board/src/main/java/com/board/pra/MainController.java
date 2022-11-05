package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/main")
	@ResponseBody
	public String index() {
		
		//aop 제어의 역전 , 콘솔에서 확인이 가능하지만 권한은 was가 가지고 있다.
		System.out.println("인덱스입니다.");
		
		//return (pblic String으로 바꾸고 실행) 웹에서 결과를 볼 수 있다.
		return "인덱스입니다.";
	}
}
