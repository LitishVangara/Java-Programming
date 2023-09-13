import java.util.Scanner;
class Hcfof8and12m2
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=scan.nextInt();
		System.out.println("Enter Second number");
		int n2=scan.nextInt();
		while (n2>0)
		{
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		System.out.println("HCF of two numbers is : "+n1);
	}
}