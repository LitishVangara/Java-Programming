class Pattern8
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
			    if (i==1 && a==1 || i==2 && a==2 || i==3 && a==3 || i==4 && a==4 || i==5 && a==5)  // or if (i==a)
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