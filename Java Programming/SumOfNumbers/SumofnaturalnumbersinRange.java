import java.util.Scanner;
class SumofnaturalnumbersinRange
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter minimum range");
		int x= scan.nextInt();
		System.out.println("Enter maximum range");
		int y= scan.nextInt();
		int sum=0;
		for (int a=x;a<=y;a++)
		{
			sum=sum+a;
		}
		System.out.println(sum);
	}
}