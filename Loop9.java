package com.loops.pattern;

public class Loop9 {
	
	// WAP to print total count of all the numbers divisable by 4  ranges from 12 to 25  


		public static void main(String[] args) 
		{
			int count =0;
		for (int z=12;z<=25;z++)
		{ 
			if(z%4==0)
			{
				count++;
			}
		} 
		System.out.println("Total count of all the numbers divisable by 4 "+count);
		}
	}

