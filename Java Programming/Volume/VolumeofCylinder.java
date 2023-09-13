import java.util.Scanner;
class VolumeofCylinder
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Volume of Cylinder - ");
		System.out.println("Enter the radius of the Cylinder : ");
		int r = scan.nextInt();
		System.out.println("Enter the height of the Cylinder : ");
		int h = scan.nextInt();
		System.out.println("The Volume of Cylinder is : "+(3.14*r*r*h));
	}
}