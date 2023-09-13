import java.util.Scanner;   //largest of a given number
class Largestofgivennumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println ("Enter five numbers one by one : ");
		int largest = 0;
		for (int a=1;a<=5;a++)
		{
		    int n = scan.nextInt();
			if (n>largest)
			{
				largest = n;
			}
		}
		System.out.println("Largest among all numbers is : "+largest);
	}
}