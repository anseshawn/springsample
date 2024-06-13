package com.spring.sample.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// 사용하고 있는 걸 bean으로 바꿔 IoC에 넣어놓기 위해서 어노테이션으로 만든다
//@Component
@Service
public class LogTestService {
	public void getLogTest1() {
		System.out.println();
		log.info("이곳은 LogTestService 객체의 getLogTest1()메소드 입니다.");
		System.out.println();
	}
}
