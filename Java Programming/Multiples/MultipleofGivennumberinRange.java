import java.util.Scanner;
class MultipleofGivennumberinRange
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter minimum range");
		int x= scan.nextInt();
		System.out.println("Enter maximum range");
		int y= scan.nextInt();
		System.out.println("Enter a number to print its multiple");
		int z= scan.nextInt();
		for (int a=x;a<=y;a++)
		{
			if (a%z==0)
			{
			    System.out.println(a);
			}
		}
	}
}