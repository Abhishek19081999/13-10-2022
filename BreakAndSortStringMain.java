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

import java.util.Scanner;

public class BreakAndSortStringMain {

	public static void main(String[] args) {
		
		BreakAndSortString breakString=new BreakAndSortString();	//creating object of the BreakAndSortString class
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String: "); 
		String str=sc.nextLine()+" ";	// taking input from user
		
		String[] words = breakString.breakStatement(str); //using breakStatement() to break statement into words
		int len = words.length; //length of the String array

		System.out.println("Statement broken to words : "); //printing the words 
		for(String w:words)
			System.out.println(w);
		
		
		
	
		System.out.println("***********************");
		
		String sortWord = BreakAndSortString.sortStatement(words, len); // using sortStatement() to sort the words length wise.
		
		System.out.println("Sorted words according to length : " + sortWord ); //printing the sorted words
	
		sc.close();
	}

}
