import java.util.Scanner;                  //sunny number
class Numberissunnyornot
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter a number :");
		int num = scan.nextInt();
		int temp=num+1;
		int sqrt = 0;
		for (int x=1;x<=temp;x++)
		{
			if (x*x==temp)
			{
				sqrt=x;
				break;
			}
		}
		if (sqrt==0)
		{
       		System.out.println("The given number "+num+" is not Sunny number");
		}
		else
		{
			System.out.println("The given number "+num+" is Sunny number");
		}
	}
}