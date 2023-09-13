import java.util.Scanner;
class NSpynumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
        System.out.println("Enter n value to print n spy numbers :");
		int n=scan.nextInt();
		int spycount=1;
		int x=1;
		int y=1;
		while (spycount<=n)
		{
			int temp=x;
			int sum=0;
			int product=1;
			int ld=0;
		    while (x!=0)
		    {
			    ld=x%10;
			    sum=sum+ld;
			    product=product*ld;
			    x=x/10;
		    }
			x=temp;
			if (sum==product)
			{
				System.out.println(y+ ") " +x+ " is a spy number");
				y++;
				spycount++;
			}
			x++;
		}
	}
}