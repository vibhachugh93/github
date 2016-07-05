package com.qait.gitautomation.githubassignment;

//import java.io.File;
//import java.util.concurrent.TimeUnit;

import com.qait.gitautomation.userinfo.UserCredentials;
import com.qait.gitautomation.userinfo.RepositoryData;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;



public class TestClass 
{
	TestSessionInitiator test;

	
    WebDriver driver;
    String username=UserCredentials.getUsername();
    String password=UserCredentials.getPassword();
    String repoName=RepositoryData.getNewRepositoryName();
    
	// BaseClass base;
	 
	 @BeforeClass
	 public void beforeClass(){
		 test=new TestSessionInitiator();
	}
	 
	  @Test(priority=1)
	  public void TC01_onSignInPage(){
		  String expectedTitle="Sign in to GitHub · GitHub";
		  String actualTitle= test.signIn.getTitle();
		  Assert.assertEquals(expectedTitle, actualTitle,"Sign In Page Title Do not Match");
	 }
	 
	  @Test(priority=2)
	  public void TC02_successSignIn(){
		  String expectedUrl="https://github.com/";  
		  String actualUrl=test.signIn.loginWithusernameandpassword(username,password); 
		  Assert.assertEquals(expectedUrl, actualUrl,"Login Failed");
	     
	 }
	  
	  @Test(priority=3)
	  public void TC03_clickOnNewRepository() throws InterruptedException{
		  String expectedUrl="https://github.com/new";  
		  String actualUrl=test.newRepo.createNewRepository(repoName); 
		  Assert.assertEquals(expectedUrl, actualUrl,"Failed to move on new repository creation page");

    }
	  @Test(priority=4)
	   public void TC04_createNewRepository() throws InterruptedException{
	    String expectedUrl="https://github.com/vibhachugh93/NewRepository";  
	    String actualUrl=test.newRepo.createNewRepository(repoName); 
	    Assert.assertEquals(expectedUrl,actualUrl,"Failed to create new repository");
	  }
	  
	   @Test(priority=5)
	   public void TC05_cloneLinkCheck(){
	    String expectedUrl="https://github.com/vibhachugh/NewRepository.git";  
	    String cloneLinkTitle=test.cloneRepo.CloneRepository(); 
	    Assert.assertEquals(expectedUrl, cloneLinkTitle,"Failed to copy new repository clone Link");
	   }
	    
	   
	 /*  @Test()
	    public void validateCommit(){
	  	  boolean commitStatus=test.commitid.checkCommitMsg(); 
	  	  Assert.assertTrue(commitStatus,"Failed to Commit");
	    }*/
}
