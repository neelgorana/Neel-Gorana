package airindia_ex;

public class MainTest {

	public static void main(String[] args) {
		
		 AirIndia airIndia = new AirIndia(5, 1000);
	     KingFisher kingFisher = new KingFisher(5, 1000);
	     Indigo indigo = new Indigo(5, 1000);
	     
	     System.out.printf("AirIndia Amount: "+ airIndia.calculateAmount()+"\n");
	     System.out.printf("KingFisher Amount: "+ kingFisher.calculateAmount()+"\n");
	     System.out.printf("Indigo Amount: "+ indigo.calculateAmount()+"\n");
	}

}

