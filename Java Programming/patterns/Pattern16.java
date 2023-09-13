class Pattern16
{
	public static void main(String[] args) 
	{
		char c = 'A';
		for (int i=1;i<=5;i++)
		{
			for (int a=1;a<=5;a++)
			{
				System.out.print(" "+(c++)+ " ");	
            }
			System.out.println();
		}
	}
}