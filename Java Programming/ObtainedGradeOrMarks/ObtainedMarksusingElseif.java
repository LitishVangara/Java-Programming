import java.util.Scanner;
class ObtainedMarksusingElseif
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Obtained Result - ");
		System.out.println("Enter the Marks : ");
        int m = scan.nextInt();
		if (m==100 && m>=90)
		{
			System.out.println("First rank");
		}
		else if (m<=89 && m>=80)
		{
			System.out.println("Second rank");
		}
		else if (m<=79 && m>=70)
		{
			System.out.println("First class");
		}
		else if (m<=69 && m>=60)
		{
			System.out.println("Second class");
		}
		else if (m<=59 && m>=35)
		{
			System.out.println("Just pass");
		}
		else if (m<=34 && m>=0)
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("Enter Valid input");
		}
	}
}