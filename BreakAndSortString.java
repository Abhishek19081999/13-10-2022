package com.string_test.bll;
 
public class BreakAndSortString {
	

	
	public static String[] sortStatement(String s[],int n) {
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
		  for (int i=0; i<n; i++)
		  System.out.print(s[i]+" ");
	
		  return s;
	}
	
}	
	



