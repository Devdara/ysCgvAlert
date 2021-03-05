package com.example.demo.controller;

import java.util.ArrayList;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CrawlService;

@RestController
public class KakaoController {

	@Autowired
	CrawlService crawlService;
	
	@RequestMapping(value = "/kakao")
	public String root() {

		JSONObject jobjBtn = new JSONObject();
		ArrayList<String> btns = new ArrayList<>();
		btns.add("신청");
		btns.add("나의 신청 내역 (고객센터ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ)");

		jobjBtn.put("type", "buttons");
		jobjBtn.put("buttons", btns);

		crawlService.crawl();
		
		return jobjBtn.toString();

	}

}
