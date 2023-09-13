class Pattern9
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)   // or for (int a=5;a>=1;a--)
			{
			    if (i==1 && a==5 || i==2 && a==4 || i==3 && a==3 || i==4 && a==2 || i==5 && a==1)   // or if (i+j==6)  or if (i==a) with changed for loop 
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