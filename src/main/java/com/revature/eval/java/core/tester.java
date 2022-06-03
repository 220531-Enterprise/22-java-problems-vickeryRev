package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(reverse("tim"));

	}
	public static String reverse(String string) {
		String retString = "";
		for(int i = string.length()-1 ; i >= 0; i--) {
			retString += string.charAt(i);
		}
		return retString;
	}
}
