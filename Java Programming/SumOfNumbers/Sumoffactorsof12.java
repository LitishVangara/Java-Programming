class Sumoffactorsof12
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int a=1;a<=12;a++)
		{
			//I want 'a' values which divides '12'
			if (12%a==0)
			{
			    sum=sum+a;
            }
		}
		System.out.println(sum);
	}
}