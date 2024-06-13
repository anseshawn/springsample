package com.spring.sample.s0613;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
//@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class WebSiteInfor {
	private String driver;
	private String url;
	private String user;
	private String password;
}
