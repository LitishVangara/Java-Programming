import java.util.Scanner;
class AEIOU
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("To check it is AEIOU - ");
		System.out.println("Enter a letter : ");
        char letter = scan.next().charAt(0);
		if (letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U')
		{
			System.out.println("Given letter is vowel");
		}
		else
		{
			System.out.println("Given letter is not a vowel");
		}
	}
}