package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Leandro", 0.0);
		
		BusinessAccount account = new BusinessAccount(2002, "Maria", 0.0, 500.0);
	
		//UPCASTING
		
		Account acc1 = account;
		
		Account acc2 = new BusinessAccount(2002, "Seila", 0.0, 500.0);
		
		Account acc3 = new SavingsAccount(2002, "Seila", 0.0, 500.0);
		
		//DOWNCASTING
		
		BusinessAccount acc4 =  (BusinessAccount) acc2;
		
		//Erro em tempo de execução
//		BusinessAccount acc5 =  (BusinessAccount) acc3;
		
		//---------------------------
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 =  (BusinessAccount) acc3;	
			acc5.loan(200.7);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;	
			acc5.updateBalance();
			System.out.println("update");
		}
		
		
		
		//Testando sobreposição
		
		Account account_test = new Account(1001, "Alex", 1000.0);
		
		account_test.withDraw(500.0);
		System.out.println(account_test.getBalance());
		
		Account account_test2 = new SavingsAccount(1001, "Alex", 1000.0, 20.0);
		
		account_test2.withDraw(500.0);
		System.out.println(account_test2.getBalance());
		
		Account account_test3 = new BusinessAccount(1001, "Alex", 1000.0, 500.0);
		account_test3.withDraw(500.0);
		System.out.println(account_test3.getBalance());
	}
	

}
