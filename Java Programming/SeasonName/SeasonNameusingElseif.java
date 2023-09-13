import java.util.Scanner;
class SeasonNameusingElseif
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the month number : ");
        char c = scan.next().charAt(0);
		if (c=='3' || c=='4' || c=='5')
		{
			System.out.println("Season is Summer");
		}
		else if (c=='6' || c=='7' || c=='8')
		{
			System.out.println("Season is Rainy");
		}
		else if (c=='9' || c==10 || c==11)
		{
			System.out.println("Season is Spring");
		}
		else if (c==12 || c=='1' || c=='2')
		{
			System.out.println("Season is Winter");
		}
		else 
		{
			System.out.println("Enter Valid input");
		}
	}
}