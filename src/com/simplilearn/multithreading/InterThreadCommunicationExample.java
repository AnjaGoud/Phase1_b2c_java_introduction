package com.simplilearn.multithreading;

class Account {
	int balance = 10000;

	synchronized void withdraw(int amount) {

		if (amount > balance) {
			System.out.println("Less Balance, waiting for someone to deposit..");
			try {
				this.wait();
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}

		}

		this.balance = this.balance - amount;
		System.out.println("Hey, Withdraw completed..");
	}

	synchronized void deposit(int amount) {
		System.out.println("Goging to deposit amount " + amount);
		this.balance += amount;
		System.out.println("Deposited successfully and notify waiting threads..");
		this.notify();
	}

}

class WithdrawRunnable implements Runnable {
	Account account;

	public WithdrawRunnable(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(15000);
	}
}

class DepositRunnable implements Runnable {
	Account account;

	public DepositRunnable(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		this.account.deposit(10000);
	}
}

public class InterThreadCommunicationExample {

	public static void main(String[] args) {

		Account account = new Account();

		Thread t1 = new Thread(new WithdrawRunnable(account));
		t1.start();

		Thread t2 = new Thread(new DepositRunnable(account));
		t2.start();

	}

}
