import java.util.Scanner;
class Givennumberisprimeornot
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number");
		int f= scan.nextInt();
		int count =0;
		for (int a=1;a<=f;a++)
		{
			if (f%a==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("it is prime number");
		}
		else
	    {
			System.out.println("it is not a prime number");
	    }
	}
}