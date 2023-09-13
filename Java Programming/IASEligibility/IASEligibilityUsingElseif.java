import java.util.Scanner;
class IASEligibilityUsingElseif 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("IAS Eligibility - ");
		System.out.println("Enter the Age : ");
        int age = scan.nextInt();
		if (age>=21 && age<=31)
		{
			System.out.println("Eligible for IAS Exam");
		}
		else
		{
			System.out.println("Not eligible for IAS Exam");
		}
	}
}