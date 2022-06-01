package com.revature.eval.java.core;

public class tester {

	public static void main(String[] args) {
		System.out.println(toMilesPerHour(-5));

	}
	public static long toMilesPerHour(double kilometersPerHour) {
		//check parms < 0;
		
		if(kilometersPerHour < 0) {
			return -1;
		}
		long mph = Math.round(kilometersPerHour / 1.609);
		return mph;
	}
}
