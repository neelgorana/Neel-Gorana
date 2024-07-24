package constructorExamples;
import java.io.*;

public class BufferReaderMain {
	
public static void main(String args[]) {
		
		Address ad = new Address();
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter Socity name : ");
//		String sname;
		try {
			String sname = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		

		
		
	}


}
