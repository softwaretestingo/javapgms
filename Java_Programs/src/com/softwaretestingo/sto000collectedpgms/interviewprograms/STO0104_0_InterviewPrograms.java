package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0104_0_InterviewPrograms
{
	public static void main(String[] args) 
	{
		String input = "5450595638154862";
		String output = maskCreditCard(input);
		String formattedOutput = formatCreditCard(output);
		System.out.println("Input: " + input);
		System.out.println("After Masking Output: " + output);
		System.out.println("Modified Output: " + formattedOutput);
	}

	public static String maskCreditCard(String creditCardNumber) 
	{
		// Check if the credit card number is valid
		if (creditCardNumber == null || creditCardNumber.length() < 16) 
		{
			return "Invalid credit card number";
		}

		// Get the length of the credit card number
		int length = creditCardNumber.length();

		// Replace middle digits with asterisks
		StringBuilder maskedNumber = new StringBuilder();
		for (int i = 0; i < length; i++) 
		{
			if (i >= 6 && i <= 11) {
				// Check if the digit is in the middle range
				maskedNumber.append('*');
			} 
			else 
			{
				maskedNumber.append(creditCardNumber.charAt(i));
			}
		}
		return maskedNumber.toString();
	}

	public static String formatCreditCard(String creditCardNumber) 
	{
		// Check if the credit card number is valid
		if (creditCardNumber == null || creditCardNumber.length() != 16) 
		{
			return "Invalid credit card number";
		}

		// Format the credit card number
		StringBuilder formattedNumber = new StringBuilder();
		for (int i = 0; i < creditCardNumber.length(); i++) 
		{
			if (i == 4 || i == 8 || i == 12) 
			{
				formattedNumber.append('-');
			}
			formattedNumber.append(creditCardNumber.charAt(i));
		}
		return formattedNumber.toString();
	}
}