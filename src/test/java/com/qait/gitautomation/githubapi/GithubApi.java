package com.qait.gitautomation.githubapi;

import java.io.IOException;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class GithubApi 
{
	/*public static void main(String args[])
	{
		GithubApi p=new GithubApi();
		p.createRepoUsingApi();
	}*/
	@SuppressWarnings("deprecation")
	public void createRepoUsingApi() {
		try {
			GitHub github = GitHub.connectUsingPassword("vibhachugh93", "chugh9395");
			GHRepository repo = github.createRepository("new Repo", "initial commit", "xyz", true);
			System.out.println(repo.getUrl());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}



