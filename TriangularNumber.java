import java.util.*;
class  TriangularNumber
{
	static Scanner sc = new Scanner (System.in);
	public static void findTriangularNumbers(int n) 
	{
		if (n==1)
		{
			System.out.println(n);
		}
		int num=n;
		for (int i=1;i<n;i++ )
		{
				num=num-i;
				if (num==0 || num==1)
				{
					break;
				}
		}
		if (num==0)
		{
			System.out.println(n);
		}
		
	}	
	public static void main(String[] args) 
	{
		System.out.print("Enter the limit: ");
		int num = sc.nextInt();

		for (int i =1;i<=num;i++ )
		{
			findTriangularNumbers(i);
		}
	}
}
