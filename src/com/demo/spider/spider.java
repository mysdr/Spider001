package com.demo.spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.Manager.ConnectManager;


public class spider {
	public static void main(String[] args) {
		
		ConnectManager inforManager = new ConnectManager();
        
       // inforManager.setWebEle(webElement);
        
        //inforManager.getWebeleByID();
       
		inforManager.getWebeleByType();
		
        inforManager.release();
        //productCode
        
        //System.out.println(pInformation);
        
        //System.out.println(webElement.getAttribute("outerHTML"));
      
	}

	
}
