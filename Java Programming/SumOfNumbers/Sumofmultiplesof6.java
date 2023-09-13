class Sumofmultiplesof6
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int b=6;
		for (int a=1;a<=100;a++)
		{
			if (a%b==0)
			{
			    sum=sum+a;
            }
		}
		System.out.println(sum);
	}
}