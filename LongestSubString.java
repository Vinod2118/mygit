package com.technoelevate.string;

import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {

		String s1= " I love Indian army";
		String[] sArray = s1.split(" ");
		
		int longestSubStringIndex = 0;
		int longestSubStringLength=sArray[0].length();
		
		for(int i = 1; i <= sArray.length-1; i++) {
			if(sArray[i].length()>longestSubStringLength) {
				longestSubStringIndex=i;
				longestSubStringLength=sArray[i].length();
			}
		}
		System.out.println(" The longest sub string is : "+sArray[longestSubStringIndex]);
	}
}
