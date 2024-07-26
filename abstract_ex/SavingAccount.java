package abstract_ex;

public class SavingAccount extends BankAccount{
	private String cname;
	private int acc_no,ifsc;
	private int balance = 0;
	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public SavingAccount(String cname, int acc_no, int ifsc, int balance) {
		super();
		this.cname = cname;
		this.acc_no = acc_no;
		this.ifsc = ifsc;
		this.balance = balance;
	}
	
	
	

	@Override
	public String toString() {
		return "SavingAccount [cname=" + cname + ", acc_no=" + acc_no + ", ifsc=" + ifsc + ", balance=" + balance + "]";
	}

	public void deposite(int d_amount) {
		
		balance = balance + d_amount;
		System.out.println(" After Deposite Your Current Balance : " + balance);
		
	}
	
	public void withdraw(int w_amount) {
		
		balance = balance - w_amount;
		System.out.println("\n After withdraw Your Current Balance : " + balance);

		
	}
	

}
