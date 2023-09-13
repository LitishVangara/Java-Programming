import java.util.Scanner;
class Givennumberisstrongornot
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		int ld = 0;     //last digit
		while (num!=0)
		{
			ld = num%10;
			int fact=1;         //factorial
			for (int i=1;i<=ld;i++)
			{
                fact=fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
		num=temp;
		if (sum==num)
		{
			System.out.println("The given number is Strong number");
		}
		else 
		{
			System.out.println("The given number is not a Strong number");
		}
	}
}