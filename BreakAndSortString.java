package com.string_test.bll;

import java.util.ArrayList;
import java.util.List;

public class BreakAndSortString {
	
	//method for breaking Statement given by user into words
	public String[] breakStatement(String stmt) {
		
		List<String> list = new ArrayList<String>();	// declaring an arrayList with String as a generic  
		 
		char[] charArray = stmt.toCharArray(); 		//converting statement taken from user to char array
		
		String strTemp = ""; 	//empty String variable
 
		
		for (int i = 0; i < charArray.length; i++) { 	//traversing charArray and adding the words in the declared arrayList
			
			if (charArray[i] != ' ') { 
				strTemp = strTemp + charArray[i];	 //storing the words in the temporary Stringvariable 
			} 
			
			else { 
				list.add(strTemp); //adding the words to the list
				strTemp = ""; //making the temporary variable empty
			} 
		} 
 
		
		String[] arr=new String[list.size()];	//declaring a String array of size of the arrayList
	
		for (int i = 0; i < list.size(); i++) {
         arr[i] = list.get(i);		//storing the words in the String array
		}
		return arr;
	} 
	
	
	
	//method for sorting words length wise
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
			text=text+"\n"+s[i];
		}
		  
	  return text;
	}
	
}	
	



