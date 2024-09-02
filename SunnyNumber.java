import java.util.*;
class SunnyNumber
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		int n=sc.nextInt();

		int m=n+1;
		int temp=0;

		for (int i=1;(i*i)<=m ;i++ )
		{
			if ((i*i)==m)
			{
				temp=(i*i);
			}
		}
		if (m==temp)
		{
			System.out.println("The given number "+n+" is a Sunny Number.");
		}
		else
			System.out.println("The given number "+n+" is not a Sunny Number.");

	}
}
