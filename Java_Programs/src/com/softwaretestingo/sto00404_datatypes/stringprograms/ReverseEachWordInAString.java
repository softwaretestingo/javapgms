package com.softwaretestingo.sto00404_datatypes.stringprograms;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String word="Java Programming Selenium";
        String[] splitted=word.split("\\s");
        String actualReversedString="";
        for (String s:splitted){
            String reversed="";
            for(int i=s.length()-1;i>=0;i--){
                reversed=reversed+s.charAt(i);
            }
            actualReversedString=actualReversedString+reversed+" ";
        }
        System.out.println(actualReversedString);

    }



    }

