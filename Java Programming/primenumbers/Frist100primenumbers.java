class Frist100primenumbers
{
	public static void main(String[] args) 
	{
		int y=1;
        int x=2;
		int primecount=1;
		while (primecount<=100)
		{
			int count=0;
			for (int a=1;a<=x;a++)
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println((y++)+") " +x+ " is a prime number");
			    primecount++;
			}
			x++;
		}
	}
}
//	we can use this synatx also to print			System.out.println(primecount+") " +x+ " is a prime number");