package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class SeleniumConfig {

    // 프로젝트 경로
	String PROJECT_PATH = System.getProperty("user.dir");
    
    // chromedriver 경로
    public String WEB_DRIVER_PATH = PROJECT_PATH + "/chromedriver.exe";
    
    //Properties
    public String WEB_DRIVER_ID = "webdriver.chrome.driver";
    
    //크롤링 할 URL
    String URL = "";

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
    
    
	
    
    
}
