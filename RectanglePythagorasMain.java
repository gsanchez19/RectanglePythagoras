import java.util.Scanner;
public class RectanglePythagorasMain {

	public static void main(String[]args)
	{
	Scanner recScanner = new Scanner(System.in);
	double width=0;
	double height=0;
	
	System.out.print("Enter the width of the rectangle: ");
	width = recScanner.nextDouble();
	System.out.print("Enter the height of the rectangle: ");
	height=recScanner.nextDouble();
	
	// The Pythagorean theorem is a^2 + b^2 = c^2. Don't forget it, dummy.
	
	double area = width * height;
	double perimeter = width + width + height + height;
	double diagL = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	
	System.out.println("Area: Perimeter: DiagonalLength:");
	System.out.printf("%.2f %.2f %.2f",area, perimeter, diagL);
	}
}