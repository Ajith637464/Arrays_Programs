import java.util.*;
class XylemOrPhloem 
{
	static Scanner sc=new Scanner(System.in);
	public static String xylemOrPhloem(int n)
	{
		int sum1=n%10;
		int sum2=0;
		for (n=n/10;n>9 ;n/=10)
		{
			int rem=n%10;
			sum2+=rem;
		}
		sum1+=n;
		if (sum1==sum2)
		{
			return "Xylem";
		}
		return "Phloem";
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();

		String res=xylemOrPhloem(n);
		System.out.println("Output: "+res);
	}
}
