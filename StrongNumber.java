import java.util.*;
class  StrongNumber
{
	static Scanner sc=new Scanner(System.in);
	public static String isStrongNumberOrNot(int n) 
	{
		String ans="Not a Strong Number";
		int sum=0;
		for (int i=n;i>0 ;i/=10)
		{
			int rem=i%10;
			int fact=factorial(rem);
			sum+=fact;
		}
		if (sum==n)
		{
			ans="Strong Number";
		}
		return ans;
	}
	public static int factorial(int n)
	{
		int sum=1;
		for (int i=1;i<=n ;i++ )
		{
			sum*=i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();

		String res=isStrongNumberOrNot(n);
		System.out.println("The given number "+n+" is "+res);
	}
}
