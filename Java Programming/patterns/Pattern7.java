class Pattern7
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=7;i++)
		{
			for (int a=1;a<=7;a++)
			{
			    if (i==1 || i==7 || a==1 || a==7)
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