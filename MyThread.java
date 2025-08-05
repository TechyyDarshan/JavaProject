package com.darshan;

public class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Running:" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
		}
}
