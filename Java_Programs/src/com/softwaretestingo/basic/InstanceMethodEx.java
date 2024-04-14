package com.softwaretestingo.basic;
class Class_Rectangle
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Instance Method Example
	 * @param args
	 */
	private int length;
	private int width;

	public void setDimensions(int len, int wid) 
	{
		length = len;
		width = wid;
	}

	public void getArea() 
	{
		int area=length * width;
		System.out.println("The Area is: "+area);
	}
}
public class InstanceMethodEx 
{
	public static void main(String[] args) 
	{
		Class_Rectangle obj=new Class_Rectangle();
		obj.setDimensions(10, 20);
		obj.getArea();
	}
}