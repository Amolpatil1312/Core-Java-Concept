package com.csi.core;

class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);

				System.out.println("FULL STACK");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ExtendsThreadConcept {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();

	}

}
