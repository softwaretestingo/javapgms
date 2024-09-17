package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.text.DecimalFormat;
public class STO0050_1_PhoneNumberBreakdown 
{
	/*
	 * Input is a phone number Ex : 1234567890 
	 * Output: (123)45-67-890
	 */
	public static void main(String[] args) 
	{
		long phoneFmt = 123456789L;
		System.out.println("Input: "+phoneFmt);
		//get a 12 digits String, filling with left '0' (on the prefix)   
		DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
		String phoneRawString= phoneDecimalFmt.format(phoneFmt);

		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
		//suposing a grouping of 3-3-4
		String[] phoneNumArr={phoneRawString.substring(0, 3),
				phoneRawString.substring(3,6),
				phoneRawString.substring(6)};

		System.out.println("Output: "+phoneMsgFmt.format(phoneNumArr));
	}
}