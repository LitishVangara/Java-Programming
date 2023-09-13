class Pattern19
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=5;a>=1;a--)
			{
				if (i>=a)
				{
				    System.out.print(" * ");	
				}
				else
				{
					System.out.print("   ");
				}
            }
			System.out.println();
		}
	}
}