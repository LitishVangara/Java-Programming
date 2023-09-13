import java.util.Scanner;
class Petersonnumber
{
    public static void main(String args[])
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
        int num = scan.nextInt();
        int temp = num;
        int f = 1;
		int sum = 0;
        while(num!=0)
        {
            f = 1;
            int r = num%10;
            for (int i=1;i<=r;i++)
            {
                f = f*i;
            }
            sum = sum+f;
            num = num/10;
        }
        if (sum==temp)
        {
			System.out.println("It is a Peterson Number.");
        }
        else
		{
			System.out.println("It is not a Peterson Number.");
		}
    }
}