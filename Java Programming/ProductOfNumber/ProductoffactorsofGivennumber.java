import java.util.Scanner;
class ProductoffactorsofGivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter number to print its product of factors :");
		int x= scan.nextInt();
		int sum = 1;
		for (int a=1;a<=x;a++)
		{
			//I want 'a' values which divides 'x'
			if (x%a==0)
			{
			    sum=sum*a;
            }
		}
		System.out.println("The product of factors of given number is :"+sum);
	}
}