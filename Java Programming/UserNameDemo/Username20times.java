import java.util.Scanner;
class Username20times
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your username : ");
		String un = scan.next();
		for (int u=1;u<=20;u++)
		{
            System.out.println(u+" Your username is : "+un);
		}
	}
}