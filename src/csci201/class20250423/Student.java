package csci201.class20250423;

public class Student {
	
	//attributes
	private final int id;
	private final String firstName;
	private final String lastName;
	private double score;
	
	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(int id, String firstName, String lastName, double score) {
		this(id, firstName, lastName);
		this.score = score;
	}
	
	//getters
	public int id() {
		return id;
	}
	
	public String firstName() {
		return firstName;
	}
	
	public String lastName() {
		return lastName;
	}
	
	public double score() {
		return score;
	}
	
	//setters
	public void setScore(double score) {
		this.score = score;
	}
	
	//operations
	public char letterGrade() {
		if (score >= 90) return 'A';
		if (score >= 80) return 'B';
		if (score >= 70) return 'C';
		if (score >= 60) return 'D';
		return 'F';
	}
	
	//overriding toString()
	public String toString() {
		return super.toString() 
		+ "ID = " + id() 
		+ ", First Name = " + firstName() 
		+ ", Last Name = " + lastName()
		+ ", score = " + score()
		+ ", Letter Grade = " + letterGrade();
	}
	
	
}
