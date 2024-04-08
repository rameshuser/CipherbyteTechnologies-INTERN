package Task;

import java.util.Scanner;

class Account{
	protected double balance;
	public void Account(double InitialBalance) {
		this.balance=InitialBalance;
	}
	public void deposite(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdral amount: "+amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void displayBalance() {
		System.out.println("Current Balance: "+balance);
	}
}
public class Banky {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Deposite Amount");
	int dep=sc.nextInt();
	System.out.println("Enter the Withdrawl Amount");
	int wda=sc.nextInt();
		Account ac=new Account();
		ac.deposite(dep);
		ac.withdraw(wda);
		ac.displayBalance();
	}
}
