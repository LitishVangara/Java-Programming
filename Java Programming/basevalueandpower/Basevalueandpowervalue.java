import java.util.Scanner;
class Basevalueandpowervalue
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the Base value :");
		int x= scan.nextInt();
		System.out.println("Enter the Power value :");
		int y= scan.nextInt();
		int product =1;
		for (int a=1;a<=y;a++)
		{
			product = product*x;
		}
		System.out.println(product);
	}
}