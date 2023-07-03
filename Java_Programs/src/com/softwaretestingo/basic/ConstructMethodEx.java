package com.softwaretestingo.basic;
class cEx
{
	String name;
	int id;
	public cEx(String name, int id) 
	{
		this.name=name;
		this.id=id;
	}
}
public class ConstructMethodEx 
{
	public static void main(String[] args) 
	{
		cEx obj=new cEx("SoftwareTestingo", 5);
		System.out.println("Name :" + obj.name  + " and Id :" + obj.id);
	}
}