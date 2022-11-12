package com.board.pra;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//데이터를 찾을 수 없어도 404 에러를 바로 띄우기
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="entity not found")
public class DataNotFoundException extends RuntimeException{
	
	public DataNotFoundException(String message) {
		super(message);
	}
}
