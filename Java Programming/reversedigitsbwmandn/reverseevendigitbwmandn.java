import java.util.Scanner;
class reverseevendigitbwmandn
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter minimum range :");
		int min = scan.nextInt();
		System.out.println("Enter maximum range :");
		int max = scan.nextInt();
		System.out.println("The reverse of Even digit numbers are : ");
		for (int i=min;i<=max;i++)
		{
		    int reverse=0;
			if (i%2==0)
			{
				int temp=i;
		    while (temp!=0)
		    {
				int ld=0;      //last digit
			    ld=temp%10;
			    reverse=reverse*10+ld;
			    temp = temp/10;
			}
			if (reverse>10)
			{
				System.out.println(reverse);
			}
			}
		}
	}
}
