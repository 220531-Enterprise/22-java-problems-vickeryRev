package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(reverse("tim Bob Marrly pok-iey"));

	}
	public static String reverse(String phrase) {
		String[] splited = phrase.split("[-_'\\s+]");
		
		String retString = "";
		for(int i = 0; i < splited.length; i++) {
			retString += splited[i].charAt(0) + "";
		}
		
		return  retString.toUpperCase() ;
	}
}
