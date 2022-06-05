package com.revature.eval.java.core;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class tester {

	public static void main(String[] args) {
		System.out.println(getScrabbleScore("OxyphenButazone"));

	}
	public static int getScrabbleScore(String string) {

		int score = 0;
		//... why dose java not have .contains for arrays!
		String[] one = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
		List<String> oneList = new ArrayList<>(Arrays.asList(one));
		String[] two = {"d", "g"};
		List<String> twoList = new ArrayList<>(Arrays.asList(two));
		String[] three = {"b", "c", "m", "p"};
		List<String> threeList = new ArrayList<>(Arrays.asList(three));
		String[] four = {"f", "h", "v", "w", "y"};
		List<String> fourList = new ArrayList<>(Arrays.asList(four));
		String[] five = {"k"};
		List<String> fiveList = new ArrayList<>(Arrays.asList(five));
		String[] eight = {"j", "x"};
		List<String> eightList = new ArrayList<>(Arrays.asList(eight));
		String[] ten = {"q", "z"};
		List<String> tenList = new ArrayList<>(Arrays.asList(ten));
		
		string = string.toLowerCase();
		for(int i = 0; i < string.length(); i++) {
			if(twoList.contains(String.valueOf(string.charAt(i)))) {
				score +=1 ;
			}else if(threeList.contains(String.valueOf(string.charAt(i)))){
					score += 3;
			}else if(fourList.contains(String.valueOf(string.charAt(i)))){
				score +=4;
			}else if(fiveList.contains((String.valueOf(string.charAt(i))))){
				score +=5;
			}else if(eightList.contains(String.valueOf(string.charAt(i)))) {
				score +=8;
			}else if(tenList.contains((String.valueOf(string.charAt(i))))){
				score+=10;
			}else {
				score+=1;
			}
					
		}
		
		
		
		return score;
	}
}
