package com.spring.sample.s0613;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungjukRun3 {
	public static void main(String[] args) {
		// bean으로 만들어놓고 자바에서 가져오기...
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/sungjuk.xml"); // 자바 쪽 resources에 있는 xml 파일을 가져오기 / 하위폴더가 더 있다면 경로명을 적어줘야 함
		
		SungjukVO[] vos = {(SungjukVO) ctx.getBean("vo1"),(SungjukVO) ctx.getBean("vo2"),(SungjukVO) ctx.getBean("vo3")};
		
		SungjukService service = new SungjukService();
		
		service.getLine();
		service.printTitle();
		service.getLine();
		
		for(SungjukVO v : vos) {
			SungjukVO sVo = service.calc(v);
			service.printSungjuk(sVo);			
		}
		service.getLine();
		
		ctx.close();
	}
}
