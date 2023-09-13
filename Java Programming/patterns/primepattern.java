class primepattern
{
	public static void main(String[] args) 
	{
        int a=1;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (j<=i)
			    {   
                    while (a!=0)
                    {
						a++;
						int count = 0;
						for (int k = 1;k<=a;k++)
				        {
							if (a%k==0)
							{
								count++;
							}
						}
						if (count==2)
						{
							System.out.print(a+"  ");
							break;
						}
					}
				}
	        }
			System.out.println("  ");
		}
	}
}
