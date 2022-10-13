/*
 * 3.	Take a sentence as a user input. 
Break up the sentence into words.
Sort the words based on the length of the word - and print out.
Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
to
Hi,
this
welcome
session
mentoring

 */

package com.string_test.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakAndSortStringMain {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str=sc.nextLine()+" ";
		
		List<String> list = new ArrayList<String>(); 
		 
		char[] charArray = str.toCharArray(); 
		
		String strTemp = ""; 
 
		
		for (int i = 0; i < charArray.length; i++) { 
			
			if (charArray[i] != ' ') { 
				strTemp = strTemp + charArray[i]; 
			} 
			
			else { 
				list.add(strTemp); 
				strTemp = ""; 
			} 
		} 
 
		
		String[] arr=new String[list.size()];
	
		for (int i = 0; i < list.size(); i++) {
         arr[i] = list.get(i);
		}
        
		
		for (String k : arr) {
        System.out.println(k);
		}
		 
		
		
		int n=arr.length;
		
		System.out.println("length: "+n);
		System.out.println("***********************");
		
		System.out.println(BreakAndSortString.sortStatement(arr, n));
	
		
		
		
		
	
		
		sc.close();
	}

}
