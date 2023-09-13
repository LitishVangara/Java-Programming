import java.util.Scanner;
class Sumofdigitsofnumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to print sum of its digits :");
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		int ld = 0;     //last digit
		while (num!=0)
		{
			ld = num%10;
			sum = sum+ld;
			num = num/10;
		}
		System.out.println("Sum of digits in "+temp+ " is : "+sum);
	}
}