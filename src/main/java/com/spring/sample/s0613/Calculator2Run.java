package com.spring.sample.s0613;

public class Calculator2Run {
	public static void main(String[] args) {
		// 생성자를 통한 값의 주입
		Calculator2 calc = new Calculator2(50,100);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
