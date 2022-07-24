package com.simplilearn.multithreading;

class Table {
	void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("" + n + "*" + i + "=" + n * i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MultiRunnable1 implements Runnable {

	Table table;

	public MultiRunnable1(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(8);
	}
}

class MultiRunnable2 implements Runnable {

	Table table;

	public MultiRunnable2(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(9);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Table table = new Table();

		MultiRunnable1 runnable1 = new MultiRunnable1(table);
		Thread t1 = new Thread(runnable1);
		t1.setPriority(1);
		t1.start();

		MultiRunnable2 runnable2 = new MultiRunnable2(table);
		Thread t2 = new Thread(runnable2);
		t2.setPriority(10);
		t2.start();

	}

}
