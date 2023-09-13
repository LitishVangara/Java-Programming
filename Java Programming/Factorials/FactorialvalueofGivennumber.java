import java.util.Scanner;
class FactorialvalueofGivennumber 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to print its Factorial");
		int f= scan.nextInt();
		int x=1;
		for (int a=1;a<=f;a++)
		{
		    x=x*a;
		}
		System.out.println("The factorial value of given number is : "+x);
	}
}