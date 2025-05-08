package csci201.class20250402;

import csci201.CircleObject;

public class PassByValue {
	public static void main(String[] args) {
		CircleObject circle; 
		circle = new CircleObject(2);
		int i;
		i = 2;
		
		System.out.println(
				"\nchangeUs--------------------------\n"
				);
		
		System.out.println("In main before calling changeUs, \ncircle.radius = " 
		+ circle.radius()
		+ ", i = " + i);
		changeUs(circle, i); //AAAA0000
		System.out.println("\nIn main after calling changeUs, \ncircle.radius = " 
				+ circle.radius()
				+ ", i = " + i);
		System.out.println(
				"\n---\n"
				);
		System.out.println(
				"\nRewriting first instance with"
				+ "\na new instance."
				);		
		System.out.println(
			"\n-----------------------------------\n"
			);
		System.out.println(
				"\nchangeUs2--------------------------\n"
				);
		
		System.out.println("In main before calling changeUs2, \ncircle.radius = " 
		+ circle.radius()
		+ ", i = " + i);
		changeUs2(circle, i);
		System.out.println("\nIn main after calling changeUs2, \ncircle.radius = " 
				+ circle.radius()
				+ ", i = " + i);
		System.out.println(
				"\n---\n"
				);
		System.out.println(
				"\nModifying same instance rather than "
				+ "\ncreating new instance."
				);		
		System.out.println(
			"\n-----------------------------------\n"
			);
	}
	
	private static void changeUs(CircleObject circle, int i) {
		//Does not update circle value outside of function
			//because variable inside is a different address
			//from variable outside	
		System.out.println("\nIn changeUs before calling changeUs, \ncircle.radius = " 
				+ circle.radius()
				+ ", i = " + i);
		//here we are creating a new instance, and therefore a new address
		circle = new CircleObject(4);
		i = 4;
		System.out.println("In changeUs after calling changeUs, \ncircle.radius = " 
				+ circle.radius()
				+ ", i = " + i);
	}
	
	private static void changeUs2(CircleObject circle, int i) {
		System.out.println("In changeUs2 before changes, \ncircle.radius = " 
			+ circle.radius() + ", i = " + i);
		//here we are updating the same instance
			//and will see our changes outside of the function
		circle.setRadius(3); //BBBB0000
		i++; //i is stil 2 once the function finishes,and you're in main
		System.out.println("In changeUs after changes, \ncircle.radius = "
			+ circle.radius() + ", i = " + i);
	}
}


/* Why this happens
 * 
 * PassByValue
 * 		main
 * 			CircleObj circle = new CircleObj;
 * 			int i = 2;
 * 			changeUs(circle, i);
 * 			changeUs2(circle, i);
 * 			etc...
 * 
 * 	
 * 	CircleObject {
 * 		radius
 * 	...etc, all the methods
 * 
 * 	ExecutionStack
 * 		PassByValue
 * 			main()
 * 				(load executable code)
 * 				ref to CircleObject ||: Circle
 * 					Address ex. AAAA0000
 * 					Heap(?, board is murky in video) Object Loader
 * 					creates a circle Object here
 * 						CircleObject
 * 							int ||: radius
 * 								changUs(circle, i)
 *  								PassByValue changeUs(AAAA0000)
 *  									BBBB0000: circle
 *  									2: i
 *  									circle = new CircleObject(4);
 *  									i = 4;
 *  								PassByValue chagngeUs2(AAAA0000)
 *  									circle setRadius(3);
 *  									i++;
 * 		CircleObject @ AAAA0000(2)
 * 			(exes out in video)
 * 
 * Variable changes a variable is different from variable changing an object.
 * That's why i doesn't update in either function, but circle updates in changeUs2 				
 * */
