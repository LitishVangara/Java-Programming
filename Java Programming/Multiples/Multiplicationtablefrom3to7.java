import java.util.Scanner;
class Multiplicationtablefrom3to7
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number to print its multiple");
		for (int a=3;a<=7;a++)
		{
			for (int b=1;b<=10;b++)
			{
				System.out.println(a+ "*"+b+"="+(b*a));
			}
			System.out.println("========================================================");
		}
	}
}