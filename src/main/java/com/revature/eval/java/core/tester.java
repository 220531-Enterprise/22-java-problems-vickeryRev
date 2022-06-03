package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(257));

	}
	public static int sumFirstAndLastDigit(int num) {
		int first = num, second = num;
		while(first > 9) {
			first /= 10;
		}
		while(second > 9) {
			second %= 10;
		}
		
		
		return first + second;
	}
}
