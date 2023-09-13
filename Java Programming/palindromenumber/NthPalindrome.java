import java.util.Scanner;
class NthPalindrome
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter n value to print number of palindromes :");
		int n=scan.nextInt();
		int y=1;
		int x=1;
		int palindromecount=1;
		while (palindromecount<=n)
		{
			int a=x;
			int ld=0;               //last digit
			int reverse=0;
			for (int i=a;i!=0;i=i/10)
			{
				ld=i%10;
				reverse=reverse*10+ld;
			}
			x=a;
			if (reverse==x)
			{
				if (y==n)
				{
					System.out.println(y+ ") "+reverse+" is a Palindrome");
				}
				y++;
				palindromecount++;
			}
			x++;
		}
	}
}