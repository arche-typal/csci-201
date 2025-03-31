package csci201;

public class CircleObjectClient {

	public static void main(String[] args) {
		
		CircleClient.displayIntro();
		double radius = CircleClient.getInput();
		CircleObject circle = new CircleObject(radius);
		System.out.println("circle.radius = " + circle.radius());
		CircleClient.displayResults(circle.radius(), circle.calculateCircumference(), circle.calculateArea());
	}
}