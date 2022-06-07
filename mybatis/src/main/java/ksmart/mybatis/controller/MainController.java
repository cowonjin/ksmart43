package ksmart.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	/*
	 * 메인화면 index
	 * @return index.html 논리명 경로
	 * 
	 * */
	public String index() {
		return "index";
	}
}
