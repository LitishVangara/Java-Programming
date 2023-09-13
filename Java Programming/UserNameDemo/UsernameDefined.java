import java.util.Scanner;
class UsernameDefined
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your username : ");
		String un = scan.next();
		System.out.println("How many times should I print : ");
		int n = scan.nextInt();
		for (int u=1;u<=n;u++)
		{
            System.out.println(u+" Your username is : "+un);
		}
	}
}