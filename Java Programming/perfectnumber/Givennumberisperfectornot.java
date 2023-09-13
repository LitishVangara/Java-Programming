import java.util.Scanner;
class Givennumberisperfectornot
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to check wheather it is perfect number or not :");
		int x= scan.nextInt();
		int sum = 0;
		for (int a=1;a<x;a++)
		{
			//I want 'a' values which divides 'x'
			if (x%a==0)
			{
			    sum=sum+a;
            }
		}
		if (sum==x)
		{
			System.out.println("It is a Perfect Number");
		}
		else 
		{
			System.out.println("It is not a perfect Number");
		}
	}
}
// or you can use this also in line 10 - for (int a=1;a<=x;a++)           
    //and
// in line 18 add this - sum = sum-x 