package practiceprob;

public class Planet {
	
	private String name;
    private double distance; 
	private double gravity;
	
	  public Planet(String name, double distance, double gravity) {
			this.name = name;
			this.distance = distance;
			this.gravity = gravity;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getGravity() {
		return gravity;
	}

	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	
	

	@Override
	public String toString() {
		return "Planet [name=" + name + ", distance=" + distance + ", gravity=" + gravity + "]";
	}

	public static void main(String[] args) {
		Planet p1 = new Planet("earth", 1000.0,100.0);
		Planet p2 = new Planet("venus", 2000.0,10.0);

		System.out.println(p1);
		System.out.println(p2);

	}

}
