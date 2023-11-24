package selenium_regular;

import java.util.Scanner;

public class If_else 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("plz enter the age");
	int age=sc.nextInt();
	
	if(age>=18) {
		System.out.println("Adult");
	}

		else {
	    System.out.println("not Adult");
			
	}
}

}
