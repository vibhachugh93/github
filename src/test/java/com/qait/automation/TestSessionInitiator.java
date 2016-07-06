package com.qait.automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.qait.gitautomation.getPageobjects.CloneRepositoryPage;
import com.qait.gitautomation.getPageobjects.CommitPage;
//import com.qait.gitautomation.getPageobjects.CommitPage;
import com.qait.gitautomation.getPageobjects.CreateNewRepositoryPage;
import com.qait.gitautomation.getPageobjects.DeleteRepositoryPage;
import com.qait.gitautomation.getPageobjects.SignInPage;
import com.qait.gitautomation.githubapi.GithubApi;
import com.qait.gitautomation.terminal.ExecuteShellCommands;
import com.qait.gitautomation.terminal.GitHubTerminalAutomation;
import com.qait.gitautomation.terminal.Utility;

public class TestSessionInitiator 
{
  WebDriver driver;
  
  String url="https://github.com/login";
  
  public SignInPage signIn;
  public CreateNewRepositoryPage newRepo;
  public DeleteRepositoryPage deleteRepo;
  public CloneRepositoryPage cloneRepo;
  public CommitPage  commitid;
  public Utility util;
  public GitHubTerminalAutomation shellscript;
  public ExecuteShellCommands executecommands;
  public GithubApi p;
  

  public TestSessionInitiator()
  {
	  webdriverInitiator();
	  testInitiator();
  }
	  
  	public void webdriverInitiator() {
  		File ffExecutable=new File("/home/vibhachugh/firefox/firefox");
		 FirefoxBinary ffBinary=new FirefoxBinary(ffExecutable);
		 FirefoxProfile ffProfile=new FirefoxProfile();
		 driver=new FirefoxDriver(ffBinary,ffProfile);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.get(url);
  	}
  	
	  public void _initPage()
	  {
		  
		signIn=new SignInPage(driver);
		newRepo=new CreateNewRepositoryPage(driver);
		deleteRepo=new DeleteRepositoryPage(driver);
		cloneRepo=new CloneRepositoryPage(driver);
		commitid=new CommitPage(driver);
		util= new Utility();
		shellscript=new GitHubTerminalAutomation(driver);
		executecommands=new ExecuteShellCommands();
	    p=new GithubApi();
	  }
	  public void testInitiator()
	  {
		  _initPage();
	  }
  }







