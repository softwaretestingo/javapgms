package com.softwaretestingo.sto028_EXCEPTIONHANDLING;
//Custom Checked Exception
class InvalidAgeCheckedException extends Exception 
{	
	public InvalidAgeCheckedException(String message) 
	{
		super(message);
	}
}
public class STO0004_0_CustomCheckedException
{
    // Method that throws a checked exception
    static void validateAge(int age) throws InvalidAgeCheckedException
    {
        if (age < 18)
        {
            throw new InvalidAgeCheckedException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }
   public static void main(String[] args) 
   {
        try 
        {
            validateAge(16);   // change to 20 to see success case
        }
        catch (InvalidAgeCheckedException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}