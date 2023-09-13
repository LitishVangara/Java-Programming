import java.util.Scanner;
class GradeCardusingelseif
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Grade Card - ");
		System.out.println("Enter your Grade : ");
        char g = scan.next().charAt(0);
		if (g=='A')
		{
			System.out.println("First rank");
		}
		else if (g=='B')
		{
			System.out.println("Second rank");
		}
		else if (g=='C')
		{
			System.out.println("First class");
		}
		else if (g=='D')
		{
			System.out.println("Second class");
		}
		else if (g=='E')
		{
			System.out.println("Just pass");
		}
		else if (g=='F')
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("Enter Valid input");
		}
	}
}