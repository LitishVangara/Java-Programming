import java.util.Scanner;
class MultiplicationTabeleofGivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		//System.out.println("Enter minimum range");
		//int x= scan.nextInt();
		//System.out.println("Enter maximum range");
		//int y= scan.nextInt();
		System.out.println("Enter a number to print its multiple");
		int z= scan.nextInt();
		for (int a=1;a<=10;a++)
		{
			System.out.println(z*a);
		}   
	}
}