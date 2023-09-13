import java.util.Scanner;
class Multiplicationtableinmanner
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to print its multiple");
		int z= scan.nextInt();
		for (int a=1;a<=10;a++)
		{
		    System.out.println(z+ "*"+a+"="+a*z);
		}
	}
}