package com.spring.sample.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//@RequestMapping(value = "/", method = RequestMethod.GET) // :9090 + context명 뒤의 마지막 슬래시를 의미
	@RequestMapping(value = {"/","/home","/index","/main"}, method = RequestMethod.GET) // 여러개 지정할 땐 중괄호 이용
	// 주소창에 http://localhost:9090/sample/ 가 들어오면 return의 home.jsp를 찾아감
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//logger.debug("Welcome home! The client locale is {}.", locale);
		// info(일반적인 정보), warning, error, debug 네 가지가 있음
		// 발생한 상황에 대한 정보를 받고 싶다면 변수로 선언해서 콤마 뒤에 붙여줌
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; // 슬래시 뒤로 home 지정, home.jsp 를 찾아감
	}
	
}
