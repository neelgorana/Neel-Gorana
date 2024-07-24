package keyword_examples;

public class Staticex {

	static String msg = "Neel Gorana";
	static int count = 0;
	int i = 0;
	
	public Staticex() {
		i++;
		++count;
	}

	@Override
	public String toString() {
		return "Staticex [i=" + i + "]";
	}
	
}
