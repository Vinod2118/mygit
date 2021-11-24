
/* to pri nt students result, based on student marks, refer below marks 

marks			result
90- 100		|   1st rank
80 - 89		|	2nd rank
60 -79		|	1rd class
50 - 59		|	2nd class
35 - 49		|	just pass 
0 - 34		|	fail

*/

package com.practice.program;

class  StudentResult
{
public static void main(String[] args) 
{
	int marks = 25;
		if((marks >=90) && (marks <=100))
	{
			System.out.println(" Result is 1st rank ");
	}
	else if((marks >=80) && (marks <=89))
	{
			System.out.println(" Result is 2st rank ");
	}
	else if ((marks >=60) && (marks <=79))
	{
			System.out.println(" Result is 1st class ");

	}
	else if ((marks >=50) && (marks <=59))
	{
			System.out.println(" Result is 2st class ");

	}
	else if ((marks >=35) && (marks <=49))
	{
			System.out.println(" Result is just pass ");
	}
	else if ((marks >=0) && (marks <=34))
	{
			System.out.println(" Result is fail ");
	} 
	else
	{
			System.out.println(" Invalid marks ");
	}


}
}
