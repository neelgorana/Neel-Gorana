package constructorExamples;

public class Student {

	private String names;

	public Student() {
		this.names = "unknown";
	}

	public Student(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Student [names=" + names + "]";
	}
	
	
	
	
}
