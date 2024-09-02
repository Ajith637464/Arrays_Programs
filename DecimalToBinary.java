import java.util.*;
class DecimalToBinary
{
	static Scanner sc=new Scanner (System.in);
	public static int dicimalToBinary(int n) 
	{
		int res=0;
		for (int i=n,j=1;i>0 ;i=i/2,j=j*10)
		{
			int rem=i%2;
			rem=rem*j;
			res+=rem;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		int res=dicimalToBinary(n);
		System.out.println("Output: "+res);
		
	}
}
