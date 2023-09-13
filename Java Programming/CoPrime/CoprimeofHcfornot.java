import java.util.Scanner;
class CoprimeofHcfornot
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=scan.nextInt();
		System.out.println("Enter Second number");
		int n2=scan.nextInt();
		int Hcf=0;
		for (int a=1;a<=n1;a++ )
		{
			if (n1%a==0 && n2%a==0 )
			{
				Hcf=a;
			}
		}
	    if (Hcf==1)
	    {
			System.out.println("Given numbers are co-prime");
	    }
		else
		{
			System.out.println("Given number are not a co-prime");
		}
	}
}