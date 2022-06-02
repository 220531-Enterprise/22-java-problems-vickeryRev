package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1769, -3.1762
				));

	}
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		System.out.println(firstNum + " " + secondNum);
		firstNum = ((int)(firstNum*1000)/1000.000);
		secondNum = ((int)(secondNum*1000)/1000.000);
		System.out.println(firstNum + " " + secondNum);
		if(firstNum == secondNum) {
			return true;
		}else {
			return false;
		}
	}
}
