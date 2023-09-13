class Sumofpowersdigitsof345
{
	public static void main(String[] args) 
	{
		int num = 345;
		int sum = 0;
		int product = 0;
		int temp = num;
		int ld = 0;         //last digit
		while (num!=0)
		{
			ld = num%10;
			product= ld*ld*ld;
			sum = sum+product;
			num = num/10;
		}
		System.out.println("Sum of digits in "+temp+ " is : "+sum);
	}
}