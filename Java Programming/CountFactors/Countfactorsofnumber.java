import java.util.Scanner;
class Countfactorsofnumber 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to print its factors");
		int z= scan.nextInt();
		System.out.println("the factors of "+z+" are :");
		int count =0;
		for (int a=1;a<=z;a++)
		{
			if (z%a==0)	
			{
				System.out.println(a);
			    count++;
			}
		}
		System.out.println("Total count : "+count);
	}
}