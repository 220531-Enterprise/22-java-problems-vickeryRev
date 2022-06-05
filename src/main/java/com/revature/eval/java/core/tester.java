package com.revature.eval.java.core;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tester {

	public static void main(String[] args) {
		System.out.println(cleanPhoneNumber("223.456.78908213813"));

	}

	public static String cleanPhoneNumber(String string) {

		String retString = "";
		for (int i = 0; i < string.length(); i++) {

			if (Character.isLetter(string.charAt(i))) {
				throw new IllegalArgumentException("can't have letters in a phone number");
			}

			else if (Character.isDigit(string.charAt(i))) {

				retString += string.charAt(i);
			}

		}
		if (retString.length() > 10) {
			throw new IllegalArgumentException();
		}
		return retString;
	}
}

	
