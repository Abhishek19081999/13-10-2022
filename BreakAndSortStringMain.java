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
		
		System.out.println("Enter a String: "); //taking statement input from user 
		String str=sc.nextLine()+" ";
		
		List<String> list = new ArrayList<String>();  // declaring an arrayList with String as a generic 
		 
		char[] charArray = str.toCharArray(); //converting statement taken from user to char array
		
		String strTemp = ""; //empty String variable
 
		
		for (int i = 0; i < charArray.length; i++) {  //traversing charArray and adding the words in the declared arrayList
			
			if (charArray[i] != ' ') { 
				strTemp = strTemp + charArray[i]; //storing the words in the temporary Stringvariable
			} 
			
			else { 
				list.add(strTemp); //adding the words to the list
				strTemp = ""; //making the temporary variable empty
			} 
		} 
 
		
		String[] arr=new String[list.size()]; //declaring a String array of size of the arrayList
	
		for (int i = 0; i < list.size(); i++) {
         arr[i] = list.get(i);		//storing the words in the STring array
		}
        
		
		for (String k : arr) {
        System.out.println(k);
		}
		 
		
		
		int n=arr.length; 	//length of String array
		
		System.out.println("length: "+n);
		System.out.println("***********************");
		
		//Sorting and printing the statement given by user by using the method 
		System.out.println(BreakAndSortString.sortStatement(arr, n));
	
		
		
		
		
	
		
		sc.close();
	}

}
