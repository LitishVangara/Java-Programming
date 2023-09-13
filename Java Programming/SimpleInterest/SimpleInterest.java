import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Simple Interest - ");
		System.out.println("Enter Principal amount of the product : ");
		int p = scan.nextInt();
		System.out.println("Enter the time to pay amount of the product : ");
		int t = scan.nextInt();
		System.out.println("Enter the rate of the interest of the product : ");
		int r = scan.nextInt();
		System.out.println("The Simple Interest of the Product is : "+((p*t*r)/100));
	}
}