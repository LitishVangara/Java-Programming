import java.util.Scanner;
class largestandsmallestdigitinnumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value : ");
		int n = scan.nextInt();
        int smallest = 9;
		int largest = 0;
		while (n!=0)
		{
            int lastdigit = n%10;
            if (lastdigit>largest)
			{
				largest=lastdigit;
			}
			else if (lastdigit<smallest)
			{
				smallest=lastdigit;
			}
			n=n/10;
		}
        System.out.println("Largest in n value is "+largest);
        System.out.println("Smallest in n vlaue is "+smallest);
	}
}
