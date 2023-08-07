
public class Square {

	private double side;
	
	public Square() {
		setSide(1);
	}
	
	public Square(double s) {
		setSide(s);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "A Square with Side Length " + side + " units, and has area " + getArea() + " units squared.";
	}
	
}
