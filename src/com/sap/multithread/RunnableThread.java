package com.sap.multithread;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread running");
		System.out.println("Run by "+Thread.currentThread().getName());
		
	}
	public static void main(String args[]) throws InterruptedException
	{
		RunnableThread runnableThread = new RunnableThread();
		Thread thread1 = new Thread(runnableThread);
		thread1.setName("thread1");
		Thread thread2 = new Thread(runnableThread);
		thread1.setName("thread2");
		thread1.start();
		thread2.start();
		
		
		//thread2.join();
		//thread2.setPriority(8);
		
		//decided by thread scheduler at the runtime
		
		//yield() basically means that the thread is not doing anything particularly important
		//and if any other threads or processes need to be run, they should. 
		//Otherwise, the current thread will continue to run
		//join() If any executing thread t1 calls join() on t2 i.e;
		//t2.join() immediately t1 will enter into waiting state until t2 completes its execution
	}
}
