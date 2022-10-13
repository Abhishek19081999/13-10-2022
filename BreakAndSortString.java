package com.string_test.bll;
import java.util.Arrays;
public class BreakAndSortString {
	

	
	public static String sortStatement(String s[],int n) {
		 for (int i=1 ;i<n; i++)
		    {
		        String temp = s[i];
		 
		       
		        int j = i - 1;
		        while (j >= 0 && temp.length() < s[j].length())
		        {
		            s[j+1] = s[j];
		            j--;
		        }
		        s[j+1] = temp;
		    }
		 
		String text="";
		
		
		for(int i=0;i<n;i++) {
			text=text+" "+s[i];
		}
		  
	  return text;
	}
	
}	
	



