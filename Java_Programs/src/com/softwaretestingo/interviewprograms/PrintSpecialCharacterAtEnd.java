package com.softwaretestingo.interviewprograms;
public class PrintSpecialCharacterAtEnd 
{	
	public static void main(String[] args) 
	{	
		/* "I a#m S@ou$%^ra@v";
		 *  I am Sourav#@$%^@ */
		
		String s="!I a#m S@ou$%^ra@v";
		
		String spl=s.replaceAll("[a-zA-z0-9 ]+","");
		String spl1=s.replaceAll("[$&+^,:;=?@#|'<>*()%!]+","");
		System.out.println(spl);
		System.out.println(spl1+spl);	
	}
}