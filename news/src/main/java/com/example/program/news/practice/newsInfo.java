package com.example.program.news.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newsInfo {
	@GetMapping("/news")
		public String message() {
		return ("Welcome to our news channel plzz select your news in next tab -->");
	}
	@GetMapping("/news/categories")
	public String cate() {
		return("1.Entertainment news  2.Sports news 3.AI news 4.National news  5. International news");
	}
	@GetMapping("/news/categories/Entertainment")
	public String info() {
		return("Welcome to the entertainment section blah blah blah.................");
	}
	@GetMapping("/news/categories/sports")
	public String in() {
		return("Welcome to the sports section blah blah blah.................");
	}
	@GetMapping("/news/categories/national")
	public String out() {
		return("Welcome to the national section blah blah blah.................");
	}
	@GetMapping("/news/categories/inetrnational")
	public String klo() {
		return("Welcome to the internatiional section blah blah blah.................");
	}
	@GetMapping("/news/categories/ai")
	public String back() {
		return("Welcome to the artificial intelligence section blah blah blah.................");
	}
}
