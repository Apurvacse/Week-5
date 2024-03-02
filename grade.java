package javaprogram;
import java.util.Scanner;
public class grade
{
	public static void main(String args[])
	{
	Scanner SC=new Scanner(System.in);
	System.out.println("enter marks");
	int result=SC.nextInt();
	char grade;
	if(result>=90)
	{
		grade='A';
	}
	else if(result>=80)
	{
		grade='B';
	}
	else if(result>=70)
	{
		grade='C';
	}
	else if(result>=60)
	{
		grade='D';
	}
	else {
		grade='F';
		System.out.println("FAILED");
		//break;		
	}
	System.out.println("grade of the student is"+grade);
  }
}
