import java.util.Scanner;
class GivennumberisSpyornot
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number :");
		int x=scan.nextInt();
		int temp=x;
		int sum=0;
		int ld=0;
		int product=1;
		while (x!=0)
		{
			ld=x%10;
			sum=sum+ld;
			product=product*ld;
			x=x/10;
		}
		if (sum==product)
		{
			System.out.println("It is a spy number");
		}
		else
		{
			System.out.println("It is not a spy number");
		}
	}
}