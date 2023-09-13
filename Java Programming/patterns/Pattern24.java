class Pattern24
{
	public static void main(String[] args) 
	{
		int space = 4;
		int star = 1;
		for (int i=1;i<=9;i++)
		{
			for (int a=1;a<=space;a++)
			{
			    System.out.print("   ");
			}                                               // or this for (int b=1;b<=star;b++)
			if (i<5)     // or if (i<=4)                    // {
		    {                                               //       s.o.p("*")
			    space--;                                    //  }
		    }                                               // if (i<=4)   or if (i<5)
		    else                                            // {
		    {                                               //     star++;
			    space++;                                    //     space--;
		    }                                               // }
			for (int b=1;b<=star;b++)                       // else
			{                                               // {
				System.out.print(" * ");                    //     star--;
			}                                               //     space++;
			if (i<5)     // or if (i<=4)                    // }
		    {
			    star++;
		    }
		    else
		    {
			    star--;
		    }
			System.out.println();
		}
	}
}