class Pattern22
{
	public static void main(String[] args) 
	{
		int space = 0;
		int star = 7;
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=space;a++)
			{
			    System.out.print("   ");
			}
			for (int b=1;b<=star;b++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			space++;
			star=star-2;
		}
	}
}