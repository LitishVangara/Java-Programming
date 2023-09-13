import java.util.Scanner;
class Lcmof8and12
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1=scan.nextInt();
		System.out.println("Enter Second number : ");
		int n2=scan.nextInt();
		int Lcm=0;
		for (int a=n1;a<=n1*n2;a++ )
		{
			if (a%n1==0&&a%n2==0)
			{
				Lcm=a;
				break;
		    }
		}
		System.out.println("LCM of two numbers is : "+Lcm);
	}
}