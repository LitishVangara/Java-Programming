class Primenumbersfrom1to100
{
	public static void main(String[] args) 
	{
		System.out.println("the prime numbers of 1 to 100 are : ");
        int f=100;
		for (int a=1;a<=f;a++)
		{
            int count =0;
			for (int i=1;i<=a;i++)
			{
				if (a%i==0)
			    {   
                    count++;
			    }
			}
			if (count==2)
		    {
	        System.out.println(a);
	        }
		}
	}
}