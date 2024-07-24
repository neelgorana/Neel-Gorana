package constructorExamples;

public class BufferReaderDemo {
	
	String socityName,Area;
	int pincode;
	
	public BufferReaderDemo() {
		
		this.socityName = "xyz";
		this.Area = "abc";
		this.pincode = 876;
	}
	

	public String getSocityName() {
		return socityName;
	}
	public void setSocityName(String socityName) {
		this.socityName = socityName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "Address [socityName=" + socityName + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
	
	

}
