import java.util.Scanner;
class ObtainedGradeusingSwitch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Obtained Result - ");
		System.out.println("Enter your Grade : ");
		char g = scan.next().charAt(0);
		switch (g)
		{
		    case 'A' : System.out.println("Frist rank");
		    break;
			case 'B' : System.out.println("Second rank");
		    break;
			case 'C' : System.out.println("Frist class");
		    break;
			case 'D' : System.out.println("Second rank");
		    break;
			case 'E' : System.out.println("Just pass");
		    break;
			case 'F' : System.out.println("Fail");
		    break;
			default : System.out.println("Enter valid input");
		}
	}
}