import java.util.Scanner;
class SeasonNameusingSwitch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the month number : ");
		int s = scan.nextInt();
		switch (s)
		{
		    case 3 : case 4 : case 5 : System.out.println("Summer Season");
		    break;
			case 6 : case 7 : case 8 : System.out.println("Rainy Season");
		    break;
			case 9 : case 10 : case 11 : System.out.println("Spring");
		    break;
			case 12 : case 1 : case 2 : System.out.println("Winter Season");
		    break;
			default : System.out.println("Enter valid input");
		}
	}
}