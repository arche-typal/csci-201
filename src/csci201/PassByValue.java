package csci201;

public class PassByValue {
 public static void main (String[] args) {
	 CircleObjectInClass2 circle;
	 circle = new CircleObjectInClass2(2);
	 int i;
	 i = 2;
	 System.out.println("In main before calliing changeUs,  circle.radius = " + circle.radius() + ", i = " + i);
	 changeUS(circle, i);
	 System.out.println("In main after calliing changeUs,  circle.radius = " + circle.radius() + ", i = " + i);
	 
	 
	 System.out.println("In main before calliing changeUs2,  circle.radius = " + circle.radius() + ", i = " + i);
	 changeUS2(circle, i);
	 System.out.println("In main after calliing changeUs2,  circle.radius = " + circle.radius() + ", i = " + i);
 }
 
 private static void changeUS(CircleObjectInClass2 circle, int i) {
	 System.out.println("In changeUs before changes,  circle.radius = " + circle.radius() + ", i = " + i);
	 
	 circle = new CircleObjectInClass2(4);
	 i = 4;
	 
	 System.out.println("In changeUs after changes,  circle.radius = " + circle.radius() + ", i = " + i);
 }
 
 private static void changeUS2(CircleObjectInClass2 circle, int i) {
	 System.out.println("In changeUs2 before changes,  circle.radius = " + circle.radius() + ", i = " + i);
	 
	 circle.setRadius(3);
	 i++;
	 
	 System.out.println("In changeUs2 after changes,  circle.radius = " + circle.radius() + ", i = " + i);
 }
}
