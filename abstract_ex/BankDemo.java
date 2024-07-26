package abstract_ex;
import java.util.*;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		SavingAccount sa = new SavingAccount("neel",12,4557,100);
		
		System.out.println(sa);
		System.out.println("\n enter the amount that you want to Deposite : " );
		sa.deposite(sc.nextInt());
		System.out.println("\n enter the amount that you want to WithDraw : " );
		sa.withdraw(sc.nextInt());
		
//		CurrentAccount ca = new CurrentAccount("meet",23,8768,500);
//		System.out.println(ca);
//		ca.deposite(200);
//		ca.withdraw(100);
	}

}
