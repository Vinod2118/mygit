
package com.practice.program;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		 System.out.println(" Enter the month number ");

		 int mon=scan.nextInt();
		 switch(mon)
		 {
		 case 1: System.out.println(" MonthName : January");
		 break;
		 
		 case 2: System.out.println(" MonthName : February");
		 break;
		 
		 case 3: System.out.println(" MonthName : March");
		 break;
		 
		 case 4: System.out.println(" MonthName : April");
		 break;
		 
		 case 5: System.out.println(" MonthName : May");
		 break;
		 
		 case 6: System.out.println(" MonthName : June");
		 break;
		 
		 case 7: System.out.println(" MonthName : July");
		 break;
		 
		 case 8: System.out.println(" MonthName : August");
		 break;
		 
		 case 9: System.out.println(" MonthName : September");
		 break;
		 
		 case 10: System.out.println(" MonthName : October");
		 break;
		 
		 case 11: System.out.println(" MonthName : November");
		 break;
		 case 12: System.out.println(" MonthName : December");
		 break;
		 default: System.out.println(" Month number given is invalid as per calender");
		 break;
		 
		 }
	}

}
