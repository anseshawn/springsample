package com.spring.sample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.sample.service.LogTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j // 롬복에서 제공(따로 객체 선언할 필요 없음)
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired // IoC 내부 검색
	LogTestService logTestService;
	
	//@RequestMapping(value = "/", method = RequestMethod.GET) // :9090 + context명 뒤의 마지막 슬래시를 의미
	@RequestMapping(value = {"/","/home","/index","/main","/h"}, method = RequestMethod.GET) // 여러개 지정할 땐 중괄호 이용
	// 주소창에 http://localhost:9090/sample/ 가 들어오면 return의 home.jsp를 찾아감
	public String home(Locale locale, Model model, String msg) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//logger.debug("Welcome home! The client locale is {}.", locale);
		// info(일반적인 정보), warning, error, debug 네 가지가 있음
		// 발생한 상황에 대한 정보를 받고 싶다면 변수로 선언해서 콤마 뒤에 붙여줌
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("msg", msg);
		
		return "home"; // 슬래시 뒤로 home 지정, home.jsp 를 찾아감
	}
	
	/*
		log level 5가지 계층도 : trace -> debug -> info -> warn -> error
	*/
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public String getLogTest(Model model) {
		Date today = new Date();
		
		System.out.println();
		logger.info("Logger 객체를 이용한 출력");
		logger.trace("trace: {}",today);
		logger.debug("debug: {}",today);
		logger.info("info: {}",today);
		logger.warn("warn: {}",today);
		logger.error("error: {}",today);

		System.out.println();
		log.info("롬복 라이브러리(@Slf4j)를 이용한 출력");
		log.trace("trace: {}",today);
		log.debug("debug: {}",today);
		log.info("info: {}",today);
		log.warn("warn: {}",today);
		log.error("error: {}",today);
		
		// 서비스 객체 호출하여 로그 찍어보기
		// LogTestService logTest = new LogTestService();
		// logTest.getLogTest1();
		
		// 객체 생성 없이 IoC컨테이너에 있는 bean으로 사용하기
		logTestService.getLogTest1();
		
		model.addAttribute("msg","로그파일을 출력합니다. 콘솔창을 확인하세요.");
		
		return "redirect:/";
	}
	
}
