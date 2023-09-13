import java.util.Scanner;
class Sumoffactorsofgivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter number to print its sum of factors :");
		int x= scan.nextInt();
		int sum = 0;
		for (int a=1;a<=x;a++)
		{
			//I want 'a' values which divides 'x'
			if (x%a==0)
			{
			    sum=sum+a;
            }
		}
		System.out.println("The sum of factors of given number is :"+sum);
	}
}
