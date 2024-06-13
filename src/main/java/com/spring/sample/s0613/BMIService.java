package com.spring.sample.s0613;

public class BMIService {

	public void getLine() {
		System.out.println("============================================");
	}

	public void printTitle() {
		System.out.println("이름\t키\t몸무게\tBMI\t비만지수");
	}

	public BMIVO calcBMI(BMIVO vo) {
		double hPercent = vo.getHeight()/100.0;
		double bmi = vo.getWeight()/(hPercent*hPercent);
		if(bmi > 25) vo.setStrBmi("비만");
		else if(bmi >= 23) vo.setStrBmi("과체중");
		else if(bmi >= 18.5) vo.setStrBmi("표준");
		else vo.setStrBmi("저체중");
		
		vo.setBmi(bmi);
		return vo;
	}

	public void printBMI(BMIVO vo) {
		System.out.print(vo.getName()+"\t"+vo.getHeight()+"\t"+vo.getWeight()+"\t");
		System.out.printf("%.1f",vo.getBmi());
		System.out.print("\t"+vo.getStrBmi());
		System.out.println();
	}
}
