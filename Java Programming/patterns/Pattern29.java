class Pattern29
{
	public static void main(String[] args) 
	{
		int num=1;
		for (int i=1;i<=6;i++)
		{
		    int x = i;
			for (int a=6;a>=1;a--)
			{
				if (i<=a)
				{
				    System.out.print(" "+x+" ");
					x=x+a;
				}
            }
			System.out.println();
		}
	}
}