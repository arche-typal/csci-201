package csci201.class20250423;

public class GradStudent extends Student{
	
	String researchTopic;
	
	public GradStudent(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}
	
	public GradStudent(int id, String firstName, String lastName, double score) {
		super(id, firstName, lastName);
	}
	
	public GradStudent(int id, String firstName, String lastName, double score, String topic) {
		super(id, firstName, lastName, score);
		researchTopic = topic;
	}
	
	public String researchTopic() {
		return researchTopic;
	}
	
	public void setTopic(String topic) {
		researchTopic = topic;
	}
	
	public String toString() {
		return super.toString() + " Research Topic = " + researchTopic;
	
	//
	
		
	}
}
