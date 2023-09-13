import java.util.Scanner;
class Nonfabonaccifrom1to100m2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int min = 0;
		System.out.println("Enter maximum range : ");
		int max = scan.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i=min;i<=max;i++)
		{                         
			if (i==sum)
			{
				sum = a+b;
				a = b;
				b = sum;
			}
			else
			{
		        System.out.println(i);
			}
		}
	}
}