import java.util.Scanner;
class Numberisautomorphicornot
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter a number :");
		int n = scan.nextInt();
		int count = 0;
		int temp=n;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		int y=1;
		for (int a=1;a<=count;a++)
		{
			y=y*10;
		}
		n=temp;
		if (n==(n*n)%y)
		{
		    System.out.println("Given number is an Automorphic Number");
		}
		else
		{
			System.out.println("The given number is not a Automorphic Number");
		}
	}
}