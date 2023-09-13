class Numberismagicornotm2
{
	public static void main (String[] args)
	{	
		int num = 345;
		int sum = 0;
		while (num!=0||sum>9)
		{
			if (num==0)
			{
			    num=sum;
			    sum=0;
			}
			sum=sum+num%10;
			num=num/10;
		}
		if (sum==1)
		{
			System.out.println("Magic number");
		}
		else
		{
   			System.out.println("Not a Magic number");		
		}
	}
}