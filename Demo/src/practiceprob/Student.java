package practiceprob;

public class Student {
	private String firstname, lastname, major;
	private int classyear;
	
	public Student(String firstname, String lastname, String major, int classyear) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.major = major;
		this.classyear = classyear;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getClassyear() {
		return classyear;
	}
	public void setClassyear(int classyear) {
		this.classyear = classyear;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", major=" + major + ", classyear="
				+ classyear + "]";
	}
	public static void main(String[] args) {
		Student s1 = new Student("neel", "gorana", "data analytics",2020);
		Student s2 = new Student("neel", "gorana", "cyber scurity",2025);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
