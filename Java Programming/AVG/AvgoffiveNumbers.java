import java.util.Scanner;
class AvgoffiveNumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Avg of the given five numbers - ");
		System.out.println("Enter first number : ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number : ");
		int n2 = scan.nextInt();
		System.out.println("Enter third number : ");
		int n3 = scan.nextInt();
		System.out.println("Enter fourth number : ");
		int n4 = scan.nextInt();
		System.out.println("Enter fifth number : ");
		int n5 = scan.nextInt();
		System.out.println("Avg of "+n1+" , "+n2+" , "+n3+" , "+n4+" and "+n5+" is : "+((n1+n2+n3+n4+n5)/5.0));
	}
}