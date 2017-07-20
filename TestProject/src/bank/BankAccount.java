package bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private double balance;
	
	private Lock balanceChangeLock;
	
	private Condition sufficientFundsCondition;
	
	
	public BankAccount () {
		balance =0;
		balanceChangeLock = new ReentrantLock();
		sufficientFundsCondition = balanceChangeLock.newCondition();
	}
	
	
	public void deposit(double amount){
		balanceChangeLock.lock();
		try {
			System.out.print("Depositing " +amount);
			double upBalance = balance + amount;
			System.out.println(", new balance is " +upBalance);
			balance = upBalance;
			sufficientFundsCondition.signalAll();
		}
		finally {
			balanceChangeLock.unlock();
		}
	}
	
	public void withdraw(double amount) throws InterruptedException {
		balanceChangeLock.lock();
		try {
			while (balance < amount ){
				sufficientFundsCondition.await();
				System.out.print("Withdrawing " +amount);
				double upBalance = balance - amount;
				System.out.println(", new balance is " +upBalance);
				balance = upBalance;
			}
		} finally {
			balanceChangeLock.unlock();
		}
	}
	
	public double getBalance(){
		return balance;
	}

}
