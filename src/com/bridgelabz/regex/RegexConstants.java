package com.bridgelabz.regex;

public class RegexConstants {

	public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "^([0]|\\+*91)?\\s*[6-9]{1}[0-9]{4}\\s*[0-9]{5}$";
	public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
}
