package com.revature.eval.java.core;
import java.text.DecimalFormat;
public class tester {

	public static void main(String[] args) {
		System.out.println(hasTeen(5,15,5));

	}
	public static boolean hasTeen(int x, int y, int z) {
		int[] nums = {x,y,z};
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= 13 && nums [i] <= 19) {
				
				return true;
			}
		}
		return false;
	}
}
