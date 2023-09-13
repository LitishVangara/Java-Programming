import java.util.Scanner;
class ParkFeeusingElseif
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Park entry Fee - ");
		System.out.println("Enter the Category : ");
        char c = scan.next().charAt(0);
		if (c=='M' || c=='m')
		{
			System.out.println("100Rs");
		}
		else if (c=='F' || c=='f')
		{
			System.out.println("80Rs");
		}
		else if (c=='T' || c=='t')
		{
			System.out.println("20Rs");
		}
		else if (c=='C' || c=='c')
		{
			System.out.println("5Rs");
		}
		else if (c=='S' || c=='s')
		{
			System.out.println("Free");
		}
		else 
		{
			System.out.println("Enter Valid input");
		}
	}
}