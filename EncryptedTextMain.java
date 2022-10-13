package com.string_test.bll;

import java.util.Scanner;

public class EncryptedTextMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String text= sc.nextLine();
		
		EncryptedText t = new EncryptedText(text, 10);
	    
		
	    System.out.println(t.getDecryptedText(10));
	    System.out.println(t.getEncryptedText());
	   
	    System.out.println("**********************");
	   
	    //passing new key
	    t.setKey(10, 20);
	    System.out.println(t.getDecryptedText(20));
	    System.out.println(t.getEncryptedText());
	   
	    sc.close();
	}
}
