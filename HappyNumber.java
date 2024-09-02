import java.util.*;
class HappyNumber 
{
	static Scanner sc=new Scanner (System.in);
	public static String happyNumberOrNot(int n)
	{
		String res="Unhappy";
		if (n==1)
		{
			res="Happy";
		}
		else
		{
			while (n != 1 && n != 4)
			{
				int sum=0;
				int temp=n;
				while (temp>0)
				{
					sum+=(temp%10)*(temp%10);
					temp/=10;
				}
				n=sum;
				if (n==1)
				{
					res="Happy";
					break;
				}
			}
		}
		return res; 
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		
		String res=happyNumberOrNot(n);
		System.out.println("The given number "+n+" is a "+res+" number.");
	}
}
