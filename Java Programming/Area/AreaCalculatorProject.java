import java.util.Scanner;
class AreaCalculatorProject
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Area Calculator");
		System.out.println("Welcome to the Area Calculator - ");
		System.out.println("=================================================================================");
		System.out.println();
		System.out.println("Enter 1 to find area of Circle");
		System.out.println("Enter 2 to find area of Triangle");
		System.out.println("Enter 3 to find area of Square");
		System.out.println("Enter 4 to find area of Rectangle");
		System.out.println("=================================================================================");
		System.out.println();
		System.out.println("Enter your Choice : ");
		int choice = scan.nextInt();
		switch (choice)
		{
		    case 1 :
			{
                System.out.println("You have chosen Circle to find its area");
				System.out.println("Enter the radius of a Circle : ");
				double r = scan.nextDouble();
				double area1 = 3.14*r*r;
				System.out.println("Area of the Circle is : "+area1);
				System.out.println("Thank you and Have a nice day..........."+(char)3+(char)3+(char)3);
			}
			break;
			case 2 :
			{
                System.out.println("You have chosen Triangle to find its area");
				System.out.println("Enter the base of a Triangle : ");
				double b = scan.nextDouble();
				System.out.println("Enter the height of a Triangle : ");
				double h = scan.nextDouble();
				double area2 = (1/2)*b*h;
				System.out.println("Area of the Triangle is : "+area2);
				System.out.println("Thank you and Have a nice day..........."+(char)3+(char)3+(char)3);
			}
			break;
			case 3 :
			{
                System.out.println("You have chosen Square to find its area");
				System.out.println("Enter the sides of a Square : ");
				double a = scan.nextDouble();
				double area3 = a*a;
				System.out.println("Area of the Square is : "+area3);
				System.out.println("Thank you and Have a nice day..........."+(char)3+(char)3+(char)3);
			}
			break;
			case 4 :
			{
                System.out.println("You have chosen Rectangle to find its area");
				System.out.println("Enter the length of a Rectangle : ");
				double l = scan.nextDouble();
				System.out.println("Enter the breath of a Rectangle : ");
				double w = scan.nextDouble();
				double area4 = l*w;
				System.out.println("Area of the Rectangle is : "+area4);
				System.out.println("Thank you and Have a nice day..........."+(char)3+(char)3+(char)3);
			}
			break;
			default : 
			{
				System.out.println("Enter a valid input");
			}
		}
	}
}