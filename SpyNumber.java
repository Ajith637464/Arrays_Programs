import java.util.*;
class SpyNumber 
{
	static Scanner sc = new Scanner (System.in);
	public static String spyNumberOrNot(int a) 
	{
		if (a<9)
		{
			return "Invalid";
		}
		int sum_of_digit=0;
		for (int i=a;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum_of_digit+=rem;
		}
		int product_of_digit=1;

		for (int i=a;i>0 ;i/=10 )
		{
			int rem = i%10;
			product_of_digit*=rem;
		}
		System.out.println("\nSum of digits:"+sum_of_digit);
		System.out.print("Product of digits:"+product_of_digit);

		if (sum_of_digit==product_of_digit)
		{
			return "Spy Number";
		}
		return "Not a Spy Number";

	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		String res = spyNumberOrNot(num);

		System.out.println("\n\t\t\t"+res);
	}
}
