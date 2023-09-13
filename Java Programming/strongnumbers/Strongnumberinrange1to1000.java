class Strongnumberinrange1to1000
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=50000;a++)
		{
		    int num = a;
		    int sum = 0;
		    int temp = num;
		    int ld = 0;     //last digit
		    while (num!=0)
		    {
			    ld = num%10;
			    int fact=1;         //factorial
			    for (int i=1;i<=ld;i++)
			    {
                    fact=fact*i;
			    }
			    sum = sum+fact;
			    num = num/10;
		    }
		    num=temp;
		    if (sum==num)
		    {
			    System.out.println(a);
		    }
		}
	}
}