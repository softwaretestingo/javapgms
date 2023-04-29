package com.softwaretestingo.Basic;
class Class_Rectangle
{
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