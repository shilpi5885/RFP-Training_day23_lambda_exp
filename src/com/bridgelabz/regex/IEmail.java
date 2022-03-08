package com.bridgelabz.regex;

@FunctionalInterface
public interface IEmail {

	public boolean isValidateEmail(String email, String pattern);
	
}