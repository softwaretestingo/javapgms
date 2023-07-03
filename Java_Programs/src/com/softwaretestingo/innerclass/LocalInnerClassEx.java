package com.softwaretestingo.innerclass;
public class LocalInnerClassEx 
{
	int outerVariable = 100;
	static int staticOuterVariable = 200;

	//Outer Class method
	public int outerClassMethod()
	{
		System.out.println("Outer Class method is Executed");
		int localVar = 50;
		final int finalLocalVariable = 60;   

		//Create Local Inner Class
		class LocalInnerClass
		{
			int innerVariable = 20;

			int getSum(int parameter)
			{
				// Cannot access localVar here as it's not declared as final
				return outerVariable + staticOuterVariable + finalLocalVariable +
						innerVariable + parameter;
			}
		}
		
		//Local Class will be instantiated with in the Block
		LocalInnerClass localobj=new LocalInnerClass();
		return localobj.getSum(20);

	}
	public static void main(String[] args) 
	{
		LocalInnerClassEx outerObj=new LocalInnerClassEx();
		int total=outerObj.outerClassMethod();

		System.out.println("The Total Value is: "+total);
	}
}