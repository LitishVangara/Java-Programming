class Pattern6
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
			    if (i==1 && a==5)
			    {
				    System.out.print(" # ");
			    }
				else if (i==3 && a==2)
				{
				    System.out.print(" ? ");
				}
			    else
				{
				    System.out.print(" * ");
				}
            }
			System.out.println();
		}
	}
}