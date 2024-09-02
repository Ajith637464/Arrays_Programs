import java.util.*;
class  ArmStrongNumber
{
	static Scanner sc = new Scanner (System.in);
	public static String isArmStrongNumberOrNot(int n)
	{
		String res="Not a Armstrong number";
		int digit=0;
		for (int i=n;i>0 ;i/=10 )
		{
			digit++;
		}
		int sum=0;
		for (int i=n;i>0 ;i/=10 )
		{
			int rem=i%10;
			int num=power(rem,digit);
			sum+=num;
		}
		if (sum==n)
		{
			res="Armstrong number";
		}
		return res;
	}
	public static int power(int n,int pow)
	{
		double d=Math.pow(n,pow);
			return (int)d;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the num: ");
		int n=sc.nextInt();

		/*String res=isArmStrongNumberOrNot(n);
		System.out.println("The given number "+n+" is  "+res);*/
		for (int i=1;i<=n ;i++ )
		{
			String res=isArmStrongNumberOrNot(i);
			if (res=="Armstrong number")
			{
				System.out.println();
			}
		}
	}
}
