import java.util.*;
class PalindromeOrNot
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number:");
		int n=sc.nextInt();

		int rev=0;
		for (int i=n;i>0 ;i/=10)
		{
			int rem=i%10;
			    rev=rev*10+rem;
		}
		if (n==rev)
		{
			System.out.println("Given Number "+n+" is a palindrome number.");
		}
		else
		{
			System.out.println("Given Number "+n+" is not a palindrome number.");
		}
	}
}
