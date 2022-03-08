package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validateFirstName(String fName) throws UserRegistrationException {
		IFirstName userFirstName = (firstName, pattern) -> {
			return Pattern.compile(pattern).matcher(firstName).matches() ? true : false;
		};
		return userFirstName.isValidateFirstName(fName, RegexConstants.FIRST_NAME_REGEX);
	}

	public boolean validateLastName(String lName) throws UserRegistrationException {
		ILastName userLastName = (lastName, pattern) -> {
			return Pattern.compile(pattern).matcher(lastName).matches() ? true : false;
		};
		return userLastName.isValidateLastName(lName, RegexConstants.LAST_NAME_REGEX);
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		IEmail userEmail = (usrEmail, pattern) -> {
			return Pattern.compile(pattern).matcher(usrEmail).matches() ? true : false;
		};
		return userEmail.isValidateEmail(email, RegexConstants.EMAIL_ID_REGEX);
	}

	public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException{
			IMobile userMobile = (mobile,pattern) -> {return Pattern.compile(pattern).matcher(mobile).matches() ? true : false;};
			return userMobile.isValidateMobile(mobileNumber, RegexConstants.MOBILE_NUMBER_REGEX);
	}

	public boolean validatePassword(String password) throws UserRegistrationException{
			IPassword userPassword = (psswrd,pattern) -> {return Pattern.compile(pattern).matcher(psswrd).matches() ? true : false;};
			return userPassword.isValidatePassword(password, RegexConstants.PASSWORD_REGEX);
	}
}
