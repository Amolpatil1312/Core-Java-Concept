package com.csi.core;

class Table {

	synchronized public void printTable(int n) {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);

				System.out.println(i * n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

class MyThread1 extends Thread {

	Table t;

	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		t.printTable(5);
	}
}

class MyThread2 extends Thread {

	Table t;

	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		t.printTable(100);
	}
}

class MyThread3 extends Thread {

	Table t;

	public MyThread3(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		t.printTable(1000);
	}
}

class MyThread4 extends Thread {

	Table t;

	public MyThread4(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		t.printTable(10000);
	}
}

class MyThread5 extends Thread {

	Table t;

	public MyThread5(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		t.printTable(100000);
	}
}

public class ThreadSynchronizationConcept {

	public static void main(String[] args) {

		Table tt = new Table();

		MyThread1 myThread1 = new MyThread1(tt);
		MyThread2 myThread2 = new MyThread2(tt);
		MyThread3 myThread3 = new MyThread3(tt);
		MyThread4 myThread4 = new MyThread4(tt);
		MyThread5 myThread5 = new MyThread5(tt);

		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();

	}

}
