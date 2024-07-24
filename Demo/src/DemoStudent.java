
public class DemoStudent {
	public static void main (String args[]) {
		
		Student s1 = new Student();
		
		s1.getdata();
		s1.display();
		
		Student1 s2 = new Student1();
		s2.setRollno(03);
		s2.setName("Neel");
		
//		System.out.println(s2.getRollno());
//		System.out.println(s2.getName());
//      withOut tostring();
		
		//using tostring
		System.out.println(s2);
		
	}
}
