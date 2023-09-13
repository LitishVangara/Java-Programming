import java.util.Scanner;
class Nonfabonaccifrom1to100
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter minimum range : ");
		int min = scan.nextInt();
		System.out.println("Enter maximum range : ");
		int max = scan.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i=min;sum<=max;i++)
		{
			int oldsum=sum;
			a=b;
			b=sum;
			sum=a+b;
			for (int x=(oldsum+1);x<sum;x++)
			{
				System.out.println(x);
				if (x>=100)
				{
					break;
				}
			}
		}
	}
}