package javaprogram;
import java.util.Scanner;
public class sumofnegative 
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=SC.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=SC.nextInt();
		}
		int sum1=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
				sum1+=arr[i];
		}
		System.out.println("the sum of negative numbers="+sum1);
		SC.close();	
	}
}
