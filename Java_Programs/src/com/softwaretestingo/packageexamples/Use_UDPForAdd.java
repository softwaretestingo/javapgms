package com.softwaretestingo.packageexamples;
import myPackage.Add;

public class Use_UDPForAdd 
{
	public static void main(String[] args)
	{
		Add obj = new Add();
		System.out.println(obj.add(100, 200));
	}
}