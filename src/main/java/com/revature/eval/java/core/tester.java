package com.revature.eval.java.core;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class tester {

	public static void main(String[] args) {
		System.out.println(calculateNthPrime(0));
	}

	public static int calculateNthPrime(int k) {
		
		if(k == 0) {
			IllegalArgumentException iae =
					new IllegalArgumentException();
			throw iae;
		}
		
		int prime = 0;
		int count = 0;
		int i = 0;
		i = (int) Math.sqrt(i);
		while(count < k) {
			if (isPrime(i)) {
				count++;
				prime = i;
			}
			i++;
		}
		
		return prime;
	}
	
	public static  boolean isPrime(int i) {
		
		for(int ii = 2; ii < i; ii++) {
			if(i % ii ==0) {
				return false;
			}
		}
		return true;
	}
}
