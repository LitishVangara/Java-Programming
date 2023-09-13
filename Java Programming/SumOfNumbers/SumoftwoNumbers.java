import java.util.Scanner;
class SumoftwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Sum of the given two numbers - ");
		System.out.println("Enter first number : ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int n2 = scan.nextInt();
		System.out.println("Sum of "+n1+" and "+n2+" is : "+(n1+n2));
	}
}