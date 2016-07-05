package com.qait.gitautomation.terminal;
import java.io.*;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.qait.gitautomation.getPageobjects.CreateNewRepositoryPage;
import com.qait.gitautomation.getPageobjects.SignInPage;
//import com.qait.gitautomation.userinfo.UserCredentials;

public class GitHubTerminalAutomation
{
	public File file;
	public FileWriter fw;
	public PrintWriter write;
	SignInPage signIn;
	CreateNewRepositoryPage newRepo;
	
	public void createShellFile() throws IOException{
		file = new File("clone_repo.sh");
		file.createNewFile();
	    file.setExecutable(true);
	    file.setWritable(true);		
	}
	public void execute( String cloneURL, String userN, String passW) throws IOException{
		String url= cloneURL;
		String user= userN;
		String pass= passW;
		String push= "http://"+user+":"+pass+"@github.com/"+user+"/abc.git master";
		System.out.println(push);
		fw = new FileWriter(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile());
		write = new PrintWriter(fw);
		//write.write("Hello");
		write.println("#!/bin/bash");
		write.println("cd ~");		
		write.println("git clone "+url );
		write.println("cd abc");
		write.println("gedit >'Hello'");
		write.println("git status");
		write.println("git add .");
		write.println("git commit -m'First Commit'");
		write.println("git status");
		write.println("git push "+push);
		write.println("git config --global credential.helper cache");
		write.close();
		//write.println("git push http://"+log.user+":"+log.pass+"@github.com/qaitautomation/Test_Repository.git master");
		
	}
	
}
