package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukRun {
	public static void main(String[] args) {
		// bean으로 만들어놓고 자바에서 가져오기...
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml"); // 자바 쪽 resources에 있는 xml 파일을 가져오기 / 하위폴더가 더 있다면 경로명을 적어줘야 함
		SungjukVO vo1 = (SungjukVO) ctx.getBean("vo1");
		
		System.out.println("name: "+vo1.getName());
		System.out.println("kor: "+vo1.getKor());
		System.out.println("eng: "+vo1.getEng());
		System.out.println("mat: "+vo1.getMat());
		System.out.println();
		
		SungjukVO vo2 = (SungjukVO) ctx.getBean("vo2");
		System.out.println("name: "+vo2.getName());
		System.out.println("kor: "+vo2.getKor());
		System.out.println("eng: "+vo2.getEng());
		System.out.println("mat: "+vo2.getMat());
		System.out.println();
		
		SungjukVO vo3 = (SungjukVO) ctx.getBean("vo3");
		System.out.println("name: "+vo3.getName());
		System.out.println("kor: "+vo3.getKor());
		System.out.println("eng: "+vo3.getEng());
		System.out.println("mat: "+vo3.getMat());
		
		ctx.close();
	}
}
