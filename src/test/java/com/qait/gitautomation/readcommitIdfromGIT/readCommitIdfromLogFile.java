package com.qait.gitautomation.readcommitIdfromGIT;
import java.io.*;
public class readCommitIdfromLogFile 
{
	public String read(){
			String path="/home/vibhachugh/Desktop/NewRepository/.git/logs/HEAD";
				;
			String[] contents=null;
			String value=null;
			File file=new File(path);
			BufferedReader br;
		      try {
		          br = new BufferedReader(new FileReader(file));
		          try {
		              String x;
		             while ( (x = br.readLine()) != null ) {
                  // printing out each line in the file
		                  contents=x.split(" ");
		                 value=contents[1];
		                //  System.out.println("Id from File"+contents[1]);
		               } 
		           } catch (IOException e) {
		               e.printStackTrace();
		           }
		       } catch (FileNotFoundException e) {
		    	   System.out.println(e);
		    	            e.printStackTrace();
		    	       }
		    	   return value;
		    	   	}
		       }

