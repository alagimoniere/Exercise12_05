import java.util.Scanner;

public class Exercise12_05 {
	
	public static void main(String[] args) throws IllegalTriangleException {
   
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
    
		TriangleWithException triangle = new TriangleWithException(side1, side2, side3);
    
	}
}