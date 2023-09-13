class Pattern13
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
			    if (i<=5 && a==1)
			    {
				    System.out.print(" 1 ");
			    }
				else if (i<=5 && a==2)
				{
				    System.out.print(" 2 ");
				}
				else if (i<=5 && a==3)
				{
				    System.out.print(" 3 ");
				}
				else if (i<=5 && a==4)
				{
				    System.out.print(" 4 ");
				}
				else if (i<=5 && a==5)
				{
				    System.out.print(" 5 ");
				}
			    else 
				{
				    System.out.print("  ");          // or we can use only this printing statement System.out.print(a);
				}
            }
			System.out.println();
		}
	}
}