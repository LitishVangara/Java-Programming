import java.util.Scanner;         
class Technumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter a number :");
		int num = scan.nextInt();
		int first = 0;
		int second = 0;
		int sum = 0;
		int square = 0;
		first = num/100;
		second = num%100;
		sum = first+second;
		square = sum*sum;
		if (square==num)
		{
			System.out.println("It is a Tech Number.");
		}
		else
		{
			System.out.println("It is not a Tech Number.");
		}
	}
}            