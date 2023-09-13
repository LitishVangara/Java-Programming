class Pattern10
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
			    if (i==a || i+a==6)
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