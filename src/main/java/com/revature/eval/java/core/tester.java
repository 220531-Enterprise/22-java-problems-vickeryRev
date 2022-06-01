package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 9));

	}
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if(hourOfDay > 23 || hourOfDay < 0 || !isBarking ) {
			return false;
		}
		else if((hourOfDay < 8 || hourOfDay > 22) && isBarking) {
			return true;
		}
		return false;
	}
}
