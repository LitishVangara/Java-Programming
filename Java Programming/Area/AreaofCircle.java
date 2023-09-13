import java.util.Scanner;
class AreaofCircle
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Area of Circle - ");
		System.out.println("Enter the radius of the Circle : ");
		int r = scan.nextInt();
		System.out.println("The Area of the Circle : "+(3.14*r*r));
	}
}