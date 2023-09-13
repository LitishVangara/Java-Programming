import java.util.Scanner;
class Spynumbersfrom1to10000 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter maximum range :");
		int min=1;
		int max=scan.nextInt();
		int y=1;
		for (int x=min;x<=max;x++)
		{
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
			x=temp;
            if (sum==product)
            {
				System.out.println(y+ ") " +x+ " is a spy number");
				y++;
            }
		}
	}
}