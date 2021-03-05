package com.example.demo.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.SeleniumConfig;

@Service
public class CrawlService {

	@Autowired
	SeleniumConfig seleniumConfig;
	
	WebDriver driver;
	
	public void crawl() {
		 
        try {
        	
        	seleniumConfig.setURL("http://www.naver.com");
        	
        	//System Property SetUp
            System.setProperty( seleniumConfig.WEB_DRIVER_ID, seleniumConfig.WEB_DRIVER_PATH );
            
            //Driver SetUp
            driver = new ChromeDriver();
        	
            //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
            driver.get( seleniumConfig.getURL() );
            System.out.println(driver.getPageSource());
    
        } catch (Exception e) {
            
            e.printStackTrace();
        
        } finally {
 
            driver.close();
        }
 
    }
	
}
