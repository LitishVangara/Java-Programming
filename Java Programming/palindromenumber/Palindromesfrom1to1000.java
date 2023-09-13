class Palindromesfrom1to1000
{
	public static void main(String[] args) 
	{
		int min = 1;
		int max=1000;      
		int y=1;
		for (int a=min;a<=max;a++)
		{
			int reverse=0;
			for (int i=a;i!=0;i=i/10)
			{
				reverse = reverse*10+(i%10);
			}
			if (reverse==a)
			{
				System.out.println((y++)+ ") "+reverse+" is a Palindrome");
			}
		}
	}
}