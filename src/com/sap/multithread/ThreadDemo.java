package com.sap.multithread;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Multi threaded access");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
    public static void main(String args[])
    {
    	ThreadDemo threadDemo = new ThreadDemo();
    	
    	Thread t1 = new Thread(threadDemo);
    	Thread t2 = new Thread(threadDemo);
    	
    	t1.setName("first thread");
    	t2.setName("second thread");
    	
    	t2.setPriority(10);
    	t1.setPriority(3);
    	t1.start();
    	t2.start();
    }
}
