import java.util.Scanner;
class GivennumberisPalindromeornot
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to check it is palindrome or not :");
		int num = scan.nextInt();
		int ld=0;      //last digit
		int reverse=0;
		int temp=num;
		while (num!=0)
		{
			ld=num%10;
			reverse=reverse*10+ld;
			num = num/10;
		}
		if (reverse==temp)
		{
			System.out.println("Given number is a palindrome");
		}
		else 
		{
			System.out.println("Given number is not a palindrome");
		}
	}
}