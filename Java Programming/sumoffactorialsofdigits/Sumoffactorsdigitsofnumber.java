import java.util.Scanner;
class Sumoffactorsdigitsofnumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to print factorial of its digits :");
		int num = scan.nextInt();
		int sum = 0;
		int temp = num;
		//int ld = 0;     //last digit
		while (num!=0)
		{
			//ld = num%10;
			int fact=1;         //factorial
			for (int i=1;i<=num%10;i++)
			{
                fact=fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
		System.out.println("Factorial of digits in "+temp+ " is : "+sum);
	}
}