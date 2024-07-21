package com.softwaretestingo.abstraction;
//abstract parent class
abstract class Rbi 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial//
	 * 
	 * Note: Parent Class Reference Can Access Overridden Method Of Child Class 
	 */
	// abstract method
	public abstract void deposit();
}

public class BankChildex extends Rbi 
{
	public void deposit() 
	{
		System.out.println("Deposit Method Of BankChildex Class executed");
	}

	public static void main(String[] args) 
	{
		// Child Class Method Will Be Called
		Rbi obj = new BankChildex();
		obj.deposit();
	}
}