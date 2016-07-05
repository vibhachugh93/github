/*package com.qait.gitautomation.getPageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qait.gitautomation.userinfo.UserCredentials;

public class BaseClass 
{
    WebDriver driver;
    
      String url,cloneLinkUrl;    
    
      public BaseClass(WebDriver driver)
      {
       this.driver=driver;
       PageFactory.initElements(driver, this);
      }
      
      public String getTitleFromSignIn()
      {
    	  SignInPage signIn= new SignInPage(driver);
    	     	String s=signIn.getTitle();
    	    	return s;
      }
      
      public String signInMethod()
      {
    	    SignInPage signIn= new SignInPage(driver);
    	    UserCredentials userInfo=new UserCredentials();
    	    String title=signIn.loginWithusernameandpassword(userInfo.getUsername(),userInfo.getPassword());
    	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	  	return title;
      }
      
      public String 
}
*/