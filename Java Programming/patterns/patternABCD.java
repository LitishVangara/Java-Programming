/*class patternABCD 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=7;a++)
		{
			for (int i=1;i<=3;i++)
			{
				System.out.print(" ");	
			}
			if (a==4)
			{
				System.out.print("A");
			}
		}
		System.out.println();
		for (int b=1;b<=7;b++)
		{
			for (int i=1;i<=3;i++)
			{
				System.out.print(" ");
			}
			if (b==3)
			{
				System.out.print("B  A  B");
			}
		}
		System.out.println();
		for (int c=1;c<=7;c++)
		{
			for (int i=1;i<=1;i++)
			{
				System.out.print("   ");
			}
			if (c==2)
			{
				System.out.print("C  B  A  B  C");
			}
		}
		System.out.println();
		for (int d=1;d<=7;d++)
		{
			for (int i=1;i<=1;i++)
			{
				System.out.print("   ");
			}
			if (d==1)
			{
				System.out.print("D  C  B  A  B  C  D");
			}
		}
		System.out.println();
	}
}*/
class patternABCD 
{
	public static void main(String[] args) 
	{
		int space = 3;
		char ch = 'A', ch2 = 'B';
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (char k=ch;k>='A';k--)
			{
				System.out.print(""+k+"");
			}
			if (i>=2)
			{
				for (char l='B';l<=ch2;l++)
				{
					System.out.print(""+l+"");
				}
				ch2++;
			}
			System.out.println();
			space--;
			ch++;
		}
	}
}