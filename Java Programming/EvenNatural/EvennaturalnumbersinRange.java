import java.util.Scanner;
class EvennaturalnumbersinRange
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first limit : ");
		int f = scan.nextInt();
		System.out.println("Enter the last limit : ");
		int l = scan.nextInt();
		System.out.println("Even numbers are : ");
		for (int a=f;a<=l;a++)
		{
			if (a%2==0)
			{
            System.out.println(" "+a);
			}
		}
	}
}