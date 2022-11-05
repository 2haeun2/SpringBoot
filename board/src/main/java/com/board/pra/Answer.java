package com.board.pra;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
		//id:기본키 지정
		//id:어노테이션이 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
		//Generatedvalue : 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		        //제한을 두지 않는다.
		@Column(columnDefinition = "TEXT")
		private String content;
		
		//컬럼 어노테이션이 없어도 컬럼으로 인식
		//만약 컬럼으로 인식하고 싶지 않은 필드에는  @Transient
		private LocalDateTime createDate;
		
		//ManyToOne:
		@ManyToOne
		private Question question;
}
