package com.board.pra.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.board.pra.DataNotFoundException;
import com.board.pra.Question;
import com.board.pra.QuestionRepository;

import lombok.RequiredArgsConstructor;


//DTO 를 어노테이션 하나로 정리한다.(롬복 어노테이션)
@RequiredArgsConstructor
@Service
public class QuestionService {
	//객체 생성
	private final QuestionRepository questionRepository;
	
	//리스트 불러오기
	public List<Question>getList(){
		return this.questionRepository.findAll();
		
	}
	
	public Question getQuestion(Integer id) {
		//nullpointer 을 방지해주는                               해당 
		Optional<Question> question = this.questionRepository.findById(id);
		          //해당데이터 있는지 없는지 검사, true면 값 나옴
		if(question.isPresent()) {
			return question.get();
		}else {      //직접 예외 만들기
			throw new DataNotFoundException("question not found");
		}
	}
}
