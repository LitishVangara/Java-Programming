class Armstrongfrom1to10000
{
	public static void main(String[] args) 
	{   
		for (int i=1;i<=10000;i++)
		{
		    int num = i;
		    int temp = num;
		    int count=0;
		    while (num!=0)
		    {	
		        count++;
		        num=num/10;
		    }
		    num=temp;
		    int sum = 0;
	        int ld = 0;         //last digit
		    while (num!=0)
		    {
			    ld = num%10;
		        int product = 1;
			    for (int a=1;a<=count;a++)
			    {
				    product = product*ld;
			    }
			    sum = sum+product;
			    num = num/10;
		    }
		    num=temp;
		    if (num==sum)
		    {
			    System.out.println(sum);
		    }
		}
	}
}