package com.spring.sample.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Data //Data 어노테이션은 getter, setter, toString 모두 포함 (에러발생가능성있음)
// 두번째 글자가 대문자인 경우 롬복에 문제가 발생......(예: wDate, nName) jsp에서 첫번째 글자도 대문자로 바꾸기...
public class S0612VO {
	private String name;
	private String nName;
	private String mid;
	private String pwd;
	private int age;
	private int gender;
	private String strGender;
}
