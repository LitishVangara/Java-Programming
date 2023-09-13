class Question28Pattern2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=12;j++)
			{
				if ((i+j==13) || (i+j==12) || (i==j) || (i==j-1))
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
