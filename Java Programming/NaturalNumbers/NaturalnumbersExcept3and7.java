class NaturalnumbersExcept3and7
{
	public static void main(String[] args) 
	{
		System.out.println("Natural number : ");
		for (int i=1;i<=10;i++)
		{
			if (i==3) continue;
			if (i==7) continue;
            System.out.println(" "+i);
		}
	}
}