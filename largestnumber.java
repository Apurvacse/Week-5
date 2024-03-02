package javaprogram;
import java.util.Scanner;
public class largestnumber 
{
	public static void main(String[] args)
	{
		Scanner CS=new Scanner (System.in);
		System.out.println("enter first number");
		int num1=CS.nextInt();
		System.out.println("enter second number");
		int num2=CS.nextInt();
		System.out.println("enter third number");
		int num3=CS.nextInt();
		int largest;
		if (num1>num2)
		{
			if (num1>num3)
				largest=num1;
			else
				largest=num3;	
		}
		else {
			if (num2>num3)
				largest=num2;
			else
				largest=num3;
		}
		System.out.println("the largest number is"+largest);
		
	}

}
