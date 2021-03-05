package com.example.demo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.TelegramConfig;

@Service
public class TelegramService {

	@Autowired
	TelegramConfig telegramConfig;
	
	public void funcTelegram(){
		
		telegramConfig.setSendMsg("테스트 메시지123");
		
		BufferedReader in = null;
		
		 try {
			 
			 // 호출할 url
			 URL obj = new URL( telegramConfig.getURL() ); 
			 
			 HttpURLConnection con = (HttpURLConnection)obj.openConnection();
			 con.setRequestMethod("GET");
			 in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			 String line;
			 
			 // response를 차례대로 출력
			 while((line = in.readLine()) != null) { 
				 System.out.println(line);
			 }		 
			 
		 } catch(Exception e) {
			 e.printStackTrace();
		 } finally {
			 if(in != null) try { in.close(); } catch(Exception e) { e.printStackTrace(); }
		 }
	}
	
}
