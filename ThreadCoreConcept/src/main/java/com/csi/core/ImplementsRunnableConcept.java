package com.csi.core;

class ImplThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Full Stack");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

public class ImplementsRunnableConcept {
	public static void main(String[] args) {

		ImplThread implThread = new ImplThread();

		Thread thread = new Thread(implThread);

		thread.start();
	}
}
