
public class PointThreeD {
	
	private double xPoint,yPoint,zPoint;
	
	public PointThreeD() {
		setxPoint(0);
		setyPoint(0);
		setzPoint(0);
	}
	
	public PointThreeD(double x, double y, double z) {
		setxPoint(x);
		setyPoint(y);
		setzPoint(z);
	}

	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	public double getzPoint() {
		return zPoint;
	}

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}

	@Override
	public String toString() {
		return "This is a three-dimensional point at (" + xPoint + "," + yPoint + "," + zPoint + ").";
	}
	
}
