import java.util.Scanner;
class Hcfof4numbers
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=scan.nextInt();
		System.out.println("Enter Second number");
		int n2=scan.nextInt();
		System.out.println("Enter third number");
		int n3=scan.nextInt();
		System.out.println("Enter third number");
		int n4=scan.nextInt();
		int Hcf=0;
		for (int a=1;a<=n1;a++ )
		{
			if (n1%a==0 && n2%a==0 && n3%a==0 && n4%a==0)
			{
				Hcf=a;
			}
		}
		System.out.println("HCF of four numbers is : "+Hcf);
	}
}