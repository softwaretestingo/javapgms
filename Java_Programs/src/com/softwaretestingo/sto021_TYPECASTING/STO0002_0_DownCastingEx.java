package com.softwaretestingo.sto021_TYPECASTING;
//Parent Class
class Sports
{
 void displayName()
 {
    System.out.println("Sports");
 }
}
//Child Class - Cricket
class Cricket extends Sports
{
 void displayName()
 {
    System.out.println("Cricket");
 }
}
public class STO0002_0_DownCastingEx 
{
	public static void main(String[] args) 
	{
		//This Will Give You the Error
		//Child obj=new Parent();
		
	}
}