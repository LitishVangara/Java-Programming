import java.util.Scanner;
class Reversenumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to reverse its digits :");
		int num = scan.nextInt();
		int ld=0;      //last digit
		int reverse=0;
		int temp=num;
		while (num!=0)
		{
			ld=num%10;
			reverse=reverse*10+ld;
			num = num/10;
		}
		System.out.println("Reverse of "+temp+" is : "+reverse);
	}
}