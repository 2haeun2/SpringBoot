package com.board.pra;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

//Entity class
//아래의 클래스들이 DB테이블을 대신한다.
//DB 테이블과 맵핑된다.

@Getter
@Setter
@Entity
public class Question {
	
	//id:기본키 지정
	//id:어노테이션이 지정되면 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
	//Generatedvalue : 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Column:컬럼의 세부설정 필요시 사용
	@Column(length=200)
	private String subject;
	        //제한을 두지 않는다.
	@Column(columnDefinition = "TEXT")
	private String content;
	
	//컬럼 어노테이션이 없어도 컬럼으로 인식
	//만약 컬럼으로 인식하고 싶지 않은 필드에는  @Transient
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
	private List<Answer> anwerList;//제네릭 표현
	
	
	
}
