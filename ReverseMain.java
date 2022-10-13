/*
 2.	Write a method reverse() that receives a string str as a parameter and returns the characters in str in reverse order. Thus, if the value sent to reverse() is "I me ", the method returns " em I".
 */

package com.string_test.bll;
import java.util.Scanner;

public class ReverseMain {
	
	//making a method to reverse a given String
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}
	
	//main method
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String to reverse:- ");
		String str=sc.nextLine();
		
		//reversing the String using the above reverse method
		System.out.println(reverseString(str));  
		
		sc.close();
	}
}
