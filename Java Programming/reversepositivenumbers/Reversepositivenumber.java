class Reversepositivenumber
{
	public static void main(String[] args) 
	{
		System.out.println("Reverse of only positive numbers are : ");
		for (int i=10;i<=20;i++)
		{
		    int reverse=0;
			int num=i;
				while (num!=0)
				{
					int ld=num%10;
					reverse=reverse*10+ld;
					num = num/10;
				}
				System.out.println(reverse);
		}
	}
}