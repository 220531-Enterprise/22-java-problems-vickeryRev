package com.revature.eval.java.core;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class tester {

	public static void main(String[] args) {
		int [] hi = threeLuckyNumbers();
		
		for(int i =0; i < hi.length; i++) {
			System.out.println(hi[i]);
		}
	}

	public static int[] threeLuckyNumbers() {
		
		int[] nums = new int[3];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) +1;
		}
		return nums;
	}
}