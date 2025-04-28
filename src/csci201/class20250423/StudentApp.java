package csci201.class20250423;

public class StudentApp {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Eli", "Bailey");
		
		System.out.println("ID = " + student1.id() 
		+ ", First Name = " + student1.firstName() 
		+ ", Last Name = " + student1.lastName()
		+ ", score = " + student1.score()
		+ ", Letter Grade = " + student1.letterGrade());
		
		student1.setScore(99);
		
		System.out.println("ID = " + student1.id() 
		+ ", First Name = " + student1.firstName() 
		+ ", Last Name = " + student1.lastName()
		+ ", score = " + student1.score()
		+ ", Letter Grade = " + student1.letterGrade());
		
		Student student2 = new Student(2, "Chris", "Williams", 100);
		
		System.out.println("ID = " + student2.id() 
		+ ", First Name = " + student2.firstName() 
		+ ", Last Name = " + student2.lastName()
		+ ", score = " + student2.score()
		+ ", Letter Grade = " + student2.letterGrade());
		
		System.out.println(student1);
		System.out.println(student2);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
		Student student3 = new GradStudent(3, "Zubayr", "Rashid", 66, "AI");
		System.out.println(student3 + "; Letter Grade = " + student3.letterGrade());
		
		Object obj = student3;
		System.out.println(obj);
		
		Object student4 = new Student(1, "Eli", "Bailey");
		System.out.println(student4);
	}
}