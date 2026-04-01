package com.softwaretestingo.sto028_EXCEPTIONHANDLING;
class InvalidAgeUncheckedException extends RuntimeException
{
    public InvalidAgeUncheckedException(String message) {
        super(message);
    }
}
public class STO0005_0_CustomUncheckedException
{
	// Method that throws unchecked exception
    static void validateAge(int age) 
    {
        if (age < 18)
        {
            throw new InvalidAgeUncheckedException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) 
    {
        validateAge(16);   // change to 20 to see success case
        System.out.println("Program continues...");
    }
}