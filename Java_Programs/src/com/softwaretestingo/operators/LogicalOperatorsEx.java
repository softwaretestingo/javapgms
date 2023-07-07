package com.softwaretestingo.operators;
import java.util.Scanner;
public class LogicalOperatorsEx 
{
	public static void main(String[] args) 
	{
		String uid = "software"; 
		String pwd = "testingo"; 

		Scanner s = new Scanner(System.in); 
		System.out.print("Enter username:"); 
		String uuid = s.next(); 
		System.out.print("Enter password:"); 
		String upwd = s.next(); 

		// Check if user-name and password match or not. 
		if ((uuid.equals(uid) && upwd.equals(pwd)) || (uuid.equals(pwd) && upwd.equals(uid))) 
		{ 
			System.out.println("Welcome user."); 
		} 
		else { 
			System.out.println("Wrong uid or password"); 
		} 
	}
}