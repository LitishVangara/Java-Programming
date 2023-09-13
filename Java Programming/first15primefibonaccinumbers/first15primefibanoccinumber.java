class first15primefibanoccinumber
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int count = 0;
		while (count<=15)
		{
			for (int i=1;i<=100;i++)
			{
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				int count1 = 0;
				for (int j=1;j<=n3;j++)
				{
					if (n3%j==0)
					{
						count1++;
					}
				}
				if (count1==2)
				{
					count++;
					System.out.println("The First 15 Prime Fibanocci Numbers are : "+n3);
				}
			}
		}
	}
}
