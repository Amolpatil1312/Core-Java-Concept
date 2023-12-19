package com.csi.corethread;

class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println("FULL STACK");
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println("FINTECH");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println("REACT JS");
	}
}

public class ThreadPriorityEx {

	public static void main(String[] args) {

		MyThread1 myThread1 = new MyThread1();

		MyThread2 myThread2 = new MyThread2();

		MyThread3 myThread3 = new MyThread3();

		myThread1.setPriority(5);
		myThread2.setPriority(10);
		myThread3.setPriority(1);

		myThread1.setName("XYZ");

		myThread1.start();
		myThread2.start();
		myThread3.start();

		System.out.println("MyThread1 Name: " + myThread1.getName());
		System.out.println("MyThread1 isDaemon: " + myThread1.isDaemon());

		System.out.println("MyThread 1 ID: " + myThread1.getId());
		System.out.println("MyThread 2 ID: " + myThread2.getId());
		System.out.println("MyThread 3 ID: " + myThread3.getId());

	}

}
