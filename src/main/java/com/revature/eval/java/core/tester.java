package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25000, 25150));

	}
	public static int getGreatestCommonDivisor(int first, int second) {
		if(first < 10 || second < 10) {
			return -1;
		}
		else {
			while(first != 0 && second != 0) {
				if(first > second) {
					first %= second;
				}
				else {
					second %= first;
				}	 
			}
			return first | second;
		}
	}
}
