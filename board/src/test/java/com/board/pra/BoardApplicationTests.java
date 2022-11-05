package com.board.pra;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {
	
	//객체 자동생성
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Test
	void contextLoads() {
		
		Question q= new Question();
		q.setSubject("테스트중입니다.");
		q.setContent("졸리다.");
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);
		
		Question q2= new Question();
		q2.setSubject("테스트중입니다.");
		q2.setContent("졸리다.");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
	}

}
