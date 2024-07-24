
public class CarRental {
	
	private int CarId;
	private String CarType;
	private float CarRent;
	
	
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public float getCarRent() {
		return CarRent;
	}
	public void setCarRent(float carRent) {
		CarRent = carRent;
	}
	@Override
	public String toString() {
		return "CarRental [CarId=" + CarId + ", CarType=" + CarType + ", CarRent=" + CarRent + "]";
	}
	
	
	
	
	

}
