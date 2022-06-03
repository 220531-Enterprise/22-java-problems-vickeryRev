package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(printYearsAndDays(561600));

	}
	public static String printYearsAndDays(long minutes) {
		long days, years;
		if(minutes == 0) {
			System.out.println("Invalid Value");
		}
		else {
			years = minutes / 525600;
			days = (minutes % 525600) / 1440 ;
			System.out.println(String.format("%d min = %d y and %d day", minutes, years ,days));
		}
		
		return null;
	}
}
