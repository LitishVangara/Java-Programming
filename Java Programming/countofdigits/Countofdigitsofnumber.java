import java.util.Scanner;
class Countofdigitsofnumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to count its digits :");
		long num = scan.nextLong();
		int count=0;
		long temp = num;
		while (num!=0)
		{
			count++;
			num = num/10;
		}
		System.out.println("Count of digits in "+temp+ " is : "+count);
	}
}