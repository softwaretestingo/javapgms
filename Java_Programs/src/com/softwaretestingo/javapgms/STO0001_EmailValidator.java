package com.softwaretestingo.javapgms;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Java email validation program
 * 
 * @author SoftwareTestingo
 *
 */
public class STO0001_EmailValidator 
{
	// Email Regex java
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

	// static Pattern object, since pattern is fixed
	private static Pattern pattern;

	// non-static Matcher object because it's created from the input String
	private Matcher matcher;

	public STO0001_EmailValidator() 
	{
		// initialize the Pattern object
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
	}

	/**
	 * This method validates the input email address with EMAIL_REGEX pattern
	 * 
	 * @param email
	 * @return boolean
	 */
	public boolean validateEmail(String email) 
	{
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}