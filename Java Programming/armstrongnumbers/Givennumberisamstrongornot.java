import java.util.Scanner;
class Givennumberisamstrongornot
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		int temp = num;
		int count=0;
		while (num!=0)
		{	
		    count++;
		    num=num/10;
		}
		num=temp;
		int sum = 0;
	    int ld = 0;         //last digit
		while (num!=0)
		{
			ld = num%10;
		    int product = 1;
			for (int a=1;a<=count;a++)
			{
				product = product*ld;
			}
			sum = sum+product;
			num = num/10;
		}
		num=temp;
		if (num==sum)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");     //153;371
		}
	}
}