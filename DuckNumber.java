import java.util.*;
class DuckNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
        int temp=n;
		
		if (n>0)
		{
		boolean flag=false;
		while (n>9)
		{
			int rem=n%10;
			if (rem==0)
			{
				flag=true;
				break;
			}
			n/=10;
		}
		if (flag)
		{
			System.out.println("\t\t\tThe given number "+temp+" is a Duck Number.");
		}
		else 
			System.out.println("\t\t\tThe given number "+temp+" is not a Duck Number.");
		
		}
		else 
			System.out.print("Invalid.");
		
	}
}
