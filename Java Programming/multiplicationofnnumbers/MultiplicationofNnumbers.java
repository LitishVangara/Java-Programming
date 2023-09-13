import java.util.Scanner;
class MultiplicationofNnumbers
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int mul = 1;
		for (int a=1;true;a++)
		{
			int num = scan.nextInt();
			char ch = scan.next().charAt(0);
			if (ch=='*')
			{
				mul = mul * num;
			}
			else if (ch=='=')
			{
				mul = mul * num;
				System.out.println ("-----------------");
				System.out.println (mul);
				break;
			}
		}
	}
}