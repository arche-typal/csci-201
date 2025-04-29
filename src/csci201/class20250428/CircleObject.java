package csci201.class20250428;

public class CircleObject implements Comparable{
	
	double radius;
	int creationCount = 0;
	
	public CircleObject(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "[" + super.toString() + ": Radius = " + radius + "]";
	}
	
	public boolean equals(Object that) {
		if (this == that) return true;
		if (that == null) return false;
		if (this.getClass() != that.getClass()) return false;
		
		CircleObject thatCircleObject = (CircleObject) that;
		
		return this.radius == thatCircleObject.radius;
	}
	
	public int compareTo(CircleObject that) {
		if (this == that) return 0;
		if (that == null) throw new NullPointerException("Cannot compare with null.");
		if (this.radius == that.radius()) return 0;
		if (this.radius > that.radius()) return 1;
		return -1;
	}

	private double radius() {
		return radius;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
