import java.util.Scanner;
class VotingEligibilityUsingElseif
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Voting Eligibility - ");
		System.out.println("Enter the Age : ");
        int age = scan.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			System.out.println("Not eligible for Voting");
		}
	}
}