package practiceprob;

public class Bank {

	public static void main(String[] args) {
		Customer c = new Customer("Neel", "Gorana");
		Account a1 = new Account(c, 1000.50);
		Account a2 = new Account(c, 2000.10);
		a1.accountdetails();
		a2.accountdetails();
//		System.out.println(a1);
//		System.out.println(a2);
	}

}
