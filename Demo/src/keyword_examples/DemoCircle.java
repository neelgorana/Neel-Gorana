package keyword_examples;
import java.util.*;

public class DemoCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		
		Circle c = new Circle();
		c.getArea(r);
	}

}