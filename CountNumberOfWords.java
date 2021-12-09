package com.technoelevate.string;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the Sentence....");
		String s1 = scan.nextLine();
		String[] sArr = s1.split(" ");
		System.out.println("NUmber of words in sentence is :"+sArr.length);
	}

}
