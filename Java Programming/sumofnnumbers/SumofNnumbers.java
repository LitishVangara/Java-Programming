import java.util.Scanner;
class SumofNnumbers
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int sum = 0;
		for (int a=1;true;a++)
		{
			int num = scan.nextInt();
			char ch = scan.next().charAt(0);
			if (ch=='+')
			{
				sum = sum + num;
			}
			else if (ch=='=')
			{
				sum = sum + num;
				System.out.println ("-----------------");
				System.out.println (sum);
				break;
			}
		}
	}
}