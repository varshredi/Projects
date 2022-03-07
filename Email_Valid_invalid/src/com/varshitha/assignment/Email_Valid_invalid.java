package com.varshitha.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Valid_invalid {
	 public static boolean isValidEmail(String email)  {
		   String regex = "^(.+)@(.+)$";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();

		       
		   }

		public static void main(String[] args) {
			 List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("Varshitha@gmail.com");
		       emails.add("chandana@example.com");
		       emails.add("tanu@example.me.org");
		       //invalid email addresses
		       emails.add("lakshmi.example.com");
		       emails.add("@sudha..drexample.com");
		       emails.add("rashi.ex.com");

		       for (String value : emails) {
		           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		       }
		       
		       System.out.println("Enter any email address to check");
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));}

}
