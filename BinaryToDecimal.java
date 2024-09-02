import java.util.*;
class BinaryToDecimal
{
	static Scanner sc=new Scanner (System.in);
	public static int binaryToDecimal(int n) 
	{
		int res=0;
		for (int i=n,j=1;i>0 ;i/=10,j*=2 )
		{
			int rem=i%10;
			rem=rem*j;
			res+=rem;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		int res= binaryToDecimal(n);
		System.out.println("Output: "+res);
		
	}
}
