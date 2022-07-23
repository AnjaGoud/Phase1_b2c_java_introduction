package com.simplilearn.multithreading;

class MultiRunnable implements Runnable {

	@Override
	public void run() {
		
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);	
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Executed from thread");

	}
}

public class ThreadCreationExample {

	public static void main(String[] args) throws InterruptedException {

		MultiRunnable multiRunnable = new MultiRunnable();

		Thread t1 = new Thread(multiRunnable); // NEW
		t1.start(); //

		
		t1.join(); // Join method waits for thread to die
		
		
		Thread t2 = new Thread(multiRunnable);
		t2.start();

		

		System.out.println("Finishing main thread");
	}

}
