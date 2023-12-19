package com.csi.core;

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinEx {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();

		MyThread thread2 = new MyThread();

		MyThread thread3 = new MyThread();

		MyThread thread4 = new MyThread();

		MyThread thread5 = new MyThread();

		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
