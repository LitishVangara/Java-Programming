class Check13isprimeornot
{
	public static void main(String[] args) 
	{

		int z= 13;
		int count =0;
		for (int a=1;a<=13;a++)
		{
			if (13%a==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("13 is prime number");
		}
		else
	    {
			System.out.println("13 is not prime number");
	    }
	}
}