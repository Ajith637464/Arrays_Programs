import java.util.*;
class PerfectNumber2
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number:");
		int n=sc.nextInt();

		int sum=0;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
				sum+=i;
			}
		}
		if (n==sum)
		{
			System.out.println("The given Number "+n+" is a perfect number.");
		}
		else
		{
			System.out.println("The given Number "+n+" is not a perfect number.");
		}
	}
}
