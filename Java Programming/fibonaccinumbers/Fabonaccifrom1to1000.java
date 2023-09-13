import java.util.Scanner;
class Fabonaccifrom1to1000
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
		    System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}