package const_overloading;

public class City extends State{
	
	private String city;

	public City() {
		super();
		this.city = "Ahmedabad";
		
	}
	
	public City(String city,String state) {
		super(state);
		this.city = city;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "City : " + city + super.toString() ;
	}

}
