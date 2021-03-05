package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class TelegramConfig {

	String TOKEN = "657803349:AAFXTiEhWsQEgaBWcK0SToS_VonLAnDAjN8";
	String CHAT_ID = "-1001305314007";
	String URL = "";
	String sendMsg = "";
	
	public String getURL() {
		return "https://api.telegram.org/bot" + TOKEN + "/sendmessage?chat_id=" + CHAT_ID + "&text=" + getSendMsg();
	}

	public String getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}
	
	
	
}
