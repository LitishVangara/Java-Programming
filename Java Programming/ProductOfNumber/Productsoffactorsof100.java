class Productsoffactorsof100
{
	public static void main(String[] args) 
	{
		int sum = 1;
		for (int a=1;a<=100;a++)
		{
			//I want 'a' values which divides '12'
			if (100%a==0)
			{
			    sum=sum*a;
            }
		}
		System.out.println(sum);
	}
}