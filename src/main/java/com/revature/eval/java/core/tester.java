package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(printConversion(1.5));

	}
	public static String printConversion(double kilometersPerHour) {
		String retString;
		if(kilometersPerHour < 0) {
			return "Invalid Value";
		}
		long mph = Math.round(kilometersPerHour / 1.609);
		DecimalFormat dec = new DecimalFormat("0.##");
		retString = dec.format(kilometersPerHour) + " km/h = " + dec.format(mph) + " mi/h";
		return retString ;
	}
}
