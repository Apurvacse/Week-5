package week5;
import java.util.Scanner;
public class linear_sequential {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();	
		}
		System.out.println("enter the element to search");
		int searchElement=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(array[i]==searchElement)
			{
				System.out.println("element found at index:"+i);
				found=true;
				break;	
			}
		}
	
		if (!found) {
			System.out.println("element not found in the array");
		}
	}
}
