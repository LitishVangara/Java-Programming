import java.util.Scanner;
class Multiplesof8
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the minimum limit : ");
		int min = scan.nextInt();
		System.out.println("Enter the maximum limit : ");
		int max = scan.nextInt();
		for (int a=min;a<=max;a++)
		{
			if (a%8==0)
			{
                System.out.println(a);
			}
		}
	}
}