package com.spring.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.sample.vo.S0611VO;

@Controller
@RequestMapping("/0611") // 확장자 패턴과 비슷한 역할, 중간경로가 /0611 인 링크는 모두 이 컨트롤러를 통한다
public class S0611Controller {
	//@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping("/index")
	public String getIndex() {
		//model.addAttribute("data", "이곳은 Home컨트롤러에서 보냅니다.");
		return "0611/index";
	}
	//슬래시가 중복되는 경우가 생길 수도 있기 때문에 지금은 슬래시 유무를 통일성 주고 시작
	@GetMapping("/test1")
	public String getTest1(HttpServletRequest request) {
		String mid = request.getParameter("mid");
		String pwd = request.getParameter("pwd");
		
		request.setAttribute("mid", mid);
		request.setAttribute("pwd", pwd);
		
		return "0611/test1";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String getTest2(String mid, String pwd, Model model, int age, int gender) {
		String strGender="";
		if(gender == 1 || gender==3) strGender = "남자";
		else strGender = "여자";
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		model.addAttribute("age", age-1);
		model.addAttribute("gender", strGender);
		return "0611/test2";
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String getTest3(
			String mid, 
			String pwd, 
			Model model, 
			int age, 
			//@RequestParam(name="gender") int sex // 넘어온 변수명을 바꿀 수 있음
			@RequestParam(name="gender", defaultValue = "2", required = false) int gender
			// null 값 처리는 default로 줄 수 있음, required 필수입력 여부(어노테이션에 있는 예약어)
		) {
		String strGender="";
		if(gender == 1 || gender==3) strGender = "남자";
		else strGender = "여자";
		model.addAttribute("mid", mid);
		model.addAttribute("pwd", pwd);
		model.addAttribute("age", age-1);
		model.addAttribute("gender", strGender);
		return "0611/test3";
	}
	
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	public String getTest4(
			String mid, 
			String pwd, 
			Model model, 
			int age, 
			//@RequestParam(name="gender") int sex // 넘어온 변수명을 바꿀 수 있음
			@RequestParam(name="gender", defaultValue = "2", required = false) int gender
			// null 값 처리는 default로 줄 수 있음, required 필수입력 여부(어노테이션에 있는 예약어)
			) {
		String strGender="";
		if(gender == 1 || gender==3) strGender = "남자";
		else strGender = "여자";
		
		S0611VO vo = new S0611VO();
		vo.setMid(mid);
		vo.setPwd(pwd);
		vo.setAge(age);
		vo.setStrGender(strGender);
		
		model.addAttribute("vo", vo);
		return "0611/test4";
	}
	
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String getTest5(S0611VO vo, Model model) {
		if(vo.getGender() == 1 || vo.getGender()==3) vo.setStrGender("남자");
		else vo.setStrGender("여자");
		
		model.addAttribute("vo", vo);
		
		return "0611/test5";
	}
}
