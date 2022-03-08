package com.bridgelabz.regex;

@FunctionalInterface
public interface IPassword {

	public boolean isValidatePassword(String email, String pattern);
	
}