package practiceprob;

public class Account {
	private Customer customer;
    private double balance;
    
	public Account(Customer customer, double balance) {
		this.customer = customer;
		this.balance = balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void accountdetails() {
		customer.customerdetails();
		System.out.println("Balance " + balance);
	}
    
}
