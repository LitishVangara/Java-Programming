import java.util.Scanner;   //smallest of a given number
class SmallestofGivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println ("Enter five numbers one by one : ");
		int n1 = scan.nextInt();
		int smallest = n1;
		for (int a=1;a<=4;a++)
		{
		    int n = scan.nextInt();
			if (n<smallest)
			{
				smallest = n;
			}
		}
		System.out.println("Smallest among all numbers is : "+smallest);
	}
}