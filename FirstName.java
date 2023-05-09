package com.java;
import java.util.*;
import java.util.regex.Pattern;

import org.junit.Test;
public class FirstName {
	static Scanner fNameInput = new Scanner(System.in);
	public static void main(String[] args) {
	
		validateFirstName();
	}
		// UC1 - First name starts with caps and has minimum 3 characters.
	@Test	
	public static void validateFirstName() {
			System.out.println("Enter first name: ");
			String fName = fNameInput.nextLine();

			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);

			if (pattern.matcher(fName).matches()) {
				System.out.println("First name: " + fName + " is valid.");
			} else {
				System.out.println("First name: " + fName + " is invalid.");
			}

		}
}
