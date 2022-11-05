package com.board.pra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//롬복의 GEETR,SETTER 어노테이션을 통해 SET,GET등의 메서드를 굳이 작성하지 않아도 사용할 수 있도록 처리해주고 있다.
@Getter
//@Setter
//RequiredArgsConstructor: 해당 속성을 필요로 하는 생성자가 롬복을 통해 자동 생성,
                          //의존성 주입에도 사용한다,
@RequiredArgsConstructor
public class LombokTest {
	
	private final String hello;
	private final int lomboklnk;
	
	/* 생성자 초기화
	 * public LombokTest(String hello, int lomboklnt) { this.hello = hello;
	 * this.lomboklnk= lomboklnk; }
	 */
	
	public static void main(String[] args) {
		LombokTest lombok = new LombokTest("안녕",1004);
		
		//lombok.setHello("안녕");
		//lombok.setLomboklnk(1004);
		
		System.out.println(lombok.getHello());
		System.out.println(lombok.getLomboklnk());
	}

}
