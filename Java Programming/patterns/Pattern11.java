class Pattern11
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
			    if (i==1 && a<=5)
			    {
				    System.out.print(" 1 ");
			    }
				else if (i==2 && a<=5)
				{
				    System.out.print(" 2 ");
				}
				else if (i==3 && a<=5)
				{
				    System.out.print(" 3 ");
				}
				else if (i==4 && a<=5)
				{
				    System.out.print(" 4 ");
				}
				else if (i==5 && a<=5)
				{
				    System.out.print(" 5 ");
				}
			    else 
				{
				    System.out.print("  ");           // or we can use only this printing statement System.out.print(i);
				}
            }
			System.out.println();
		}
	}
}