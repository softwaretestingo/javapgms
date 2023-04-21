package com.softwaretestingo.mpradhanpgms;

public class RevWord {

	public static void main(String[] args) {

		String s="monoj kumar pradhan", rev="";
		String []sWord=s.split(" ");

		for (int i = sWord.length-1; i >=0; i--) {
			rev=rev+sWord[i]+ " ";
		}
		System.out.println(rev);
	}
}
