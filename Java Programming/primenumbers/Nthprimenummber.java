import java.util.Scanner;
class Nthprimenummber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println ("Enter n value to print nth prime :");
		int y=1;
        int x=2;
		int n=scan.nextInt();
		int primecount=1;
		while (primecount<=n)
		{
			int count=0;
			for (int a=1;a<=x;a++)
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (y==n)
				{
					System.out.println (y+") "+x);
				}
				y++;
			    primecount++;
			}
			x++;
		}
	}
}
//	we can use this synatx also to print			System.out.println(primecount+") " +x+ " is a prime number");