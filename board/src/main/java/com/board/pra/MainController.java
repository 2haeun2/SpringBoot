package com.board.pra;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.pra.question.QuestionService;

import lombok.RequiredArgsConstructor;
              //url Prefix :공통된 url에서 일부분은 해당 컨트롤러등에서 바로 적용 할 수 있도록
              //설정하는 URL 매핑 규칙
@RequestMapping("/question")
@RequiredArgsConstructor
@Controller
public class MainController {
	
	private final QuestionService questionService;
	
	@RequestMapping(value = "/list")
	//@RequestMapping("/question/list")
	//view 단 없어서 넣은거임
	public String list(Model model){
		List<Question>questionList = this.questionService.getList();
		model.addAttribute("questionList",questionList);	
		return "question_list";
	}
	
	@RequestMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question",question);
		return "question_detail";

	}
	
	@RequestMapping("/main")
	@ResponseBody
	public String index() {
		
		//aop 제어의 역전 , 콘솔에서 확인이 가능하지만 권한은 was가 가지고 있다.
		System.out.println("인덱스입니다.");
		
		//return (pblic String으로 바꾸고 실행) 웹에서 결과를 볼 수 있다.
		return "인덱스입니다.";
	}
}
