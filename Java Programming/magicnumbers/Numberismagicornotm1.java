import java.util.Scanner;
class Numberismagicornotm1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		int sum = 0;
		while (num>=9)
		{
			int ld = 0;         //lastdigit
			while (num!=0)
			{
			    ld=num%10;
			    sum=sum+ld;
			    num=num/10;
			}
			num=sum;
			sum=0;
			System.out.println(num);
		}
		if(num==1)
		{
			System.out.println("The given number is Magic number");
		}
		else 
		{
			System.out.println("The given number is not a Magic number");
		}
	}
}