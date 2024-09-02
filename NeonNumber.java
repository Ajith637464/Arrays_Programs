import java.util.*;
class NeonNumber
{
	static Scanner sc = new Scanner (System.in);
	public static boolean isNeonNumber(int n) 
	{
		int square_num=n*n;
		int sum_of_digits=0;

		for (int i=square_num;i>0 ; i/=10)
		{
			int rem = i%10;
			sum_of_digits+=rem;
		}
		if (n==sum_of_digits)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		if (isNeonNumber(num))
		{
			System.out.println("\n\t\t\tGiven number "+num+" is a Neon number.");
		}
		else
			System.out.println("\n\t\t\tGiven number "+num+" is not a Neon number.");
	}
}
