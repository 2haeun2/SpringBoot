package com.board.pra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Search {
	
		//자바 코드로 DB정보 받아내기 (JPA)
	
		//service 추가하기(리파지토리-> DAO,MApper 역할을 한다.)
		@Autowired
		private QuestionRepository questionRepository;//인터페이스->JpaRepository을 상속 받고 있었음
		
		@Test
		void testJpa() {
			//데이터 조회    /all ->인스턴스
			List<Question>all = this.questionRepository.findAll();
			//assertEquals(기대값,실제값)
			//기대값이 실제값과 동일하지 않으면 테스트는 실패 처리한다.
			assertEquals(1, all.size());
			
			Question q = all.get(0);
			assertEquals("테스트중입니다.", q.getSubject());
		}
		
		

}
