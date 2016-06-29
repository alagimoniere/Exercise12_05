@SuppressWarnings("serial")
public class IllegalTriangleException extends Exception {

	private double side1, side2, side3;
	
	/** Construct an exception */
	public IllegalTriangleException(double side1, double side2, double side3) {
		super("Illegal Triangle constructed with: " + side1 + ", " + side2 + ", " + side3 + ".");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		if (side1 >= side2 + side3 || side1 <= Math.abs(side3 - side2))
			System.out.print("The sum of any two sides must be greater than the "
					+ "other side.\n");
	}
	
	/**Return side 1 */
	public double getSide1() {
		return side1;
	}
	
	/**Return side 2 */
	public double getSide2() {
		return side1;
	}
	
	/**Return side 3 */
	public double getSide3() {
		return side1;
	}
	
}