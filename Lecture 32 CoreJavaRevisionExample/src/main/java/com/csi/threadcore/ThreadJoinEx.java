package com.csi.threadcore;

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
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

	public static void main(String[] args) throws InterruptedException {

		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();

		thread1.start();
		thread1.join();
		thread2.start();
		thread3.start();

	}

}
