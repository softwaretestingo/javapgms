package com.softwaretestingo.STO003_EscapeSequenceCharacters;
public class STO0001_EscapeSequenceCharacterExample 
{
	public static void main(String[] args) 
	{
		// Newline character (\n)
        System.out.println("Hello,\nWorld!");
        
        // Tab character (\t)
        System.out.println("Name:\tSoftwareTestingo");
        
        // Single Quote (\')
        char singleQuote = '\'';
        System.out.println("This is a single quote: " + singleQuote);
        
        // Double Quote (\")
        String message = "WelCome To, \"SoftwareTestingo\" Blog";
        System.out.println(message);
        
        // Backslash character (\\)
        String filePath = "C:\\Users\\softwaretestingo\\Documents\\file.txt";
        System.out.println("File path: " + filePath);
        
        // Backspace (\b)
        System.out.println("Hello \b World");
        
        // Carriage Return (\r)
        System.out.println("12345\rABCD");
        
        // Form Feed (\f)
        System.out.println("Hello\fWorld");
        
        // Using all escape characters in a string
        String allEscapeChars = "Newline: \\n, Tab: \\t, Single Quote: \', Double Quote: \", Backslash: \\\\"
                              + " Backspace: \\b, Carriage Return: \\r, Form Feed: \\f";
        System.out.println(allEscapeChars);
	}
}