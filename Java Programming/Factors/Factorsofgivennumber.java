import java.util.Scanner;
class Factorsofgivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to print its factors");
		int z= scan.nextInt();
		System.out.println("the factors of "+z+" are :");
		for (int a=1;a<=z;a++)
		{
			//I want 'a' values which divides 'z'
			if (z%a==0)
			{
			    System.out.println(a);
			}
		}
	}
}