import java.util.*;
class Fibonacci
{
	static Scanner sc=new Scanner (System.in);
	public static void fibonacci(int n) 
	{
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" ");
		for (int i=0;i<n-1 ;i++ )
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		fibonacci(n);
	}
}
