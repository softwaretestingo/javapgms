package com.softwaretestingo.basic;
abstract class Shape 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: instanceof Keyword Example
	 * @param args
	 */
	abstract void draw();
}
class Rectangle extends Shape 
{
	void draw() 
	{
		System.out.println("Drawing a rectangle");
	}
}
class Circle extends Shape 
{
	void draw() 
	{
		System.out.println("Drawing a circle");
	}
}
public class InstanceOfEx4
{
	public static void main(String[] args) 
	{
		Shape[] shapes = {new Rectangle(), new Circle()};
		for(Shape shape : shapes) 
		{
			if(shape instanceof Circle) 
			{
				Circle circle = (Circle) shape;
				circle.draw();
			} 
			else 
			{
				Rectangle rectangle = (Rectangle) shape;
				rectangle.draw();
			}
		}
	}
}