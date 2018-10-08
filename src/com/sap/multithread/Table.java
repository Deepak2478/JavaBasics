package com.sap.multithread;

public class Table implements Runnable {

	private int num;
	@Override
	public void run() {
		
		Table table  = new Table();
		table.printTable(5);
		
	}
	
	void printTable(int n){  
		 synchronized (this) {
			  for(int i=1;i<=5;i++){  
			      System.out.println(n*i);  
			     }  
		}
	 }
	 public static void main(String args[]) {
		 Table table = new Table();
		 Thread t1 = new Thread(table);
		 Thread t2 = new Thread(table);
		 t1.start();
		 t2.start();
		
	}
	 
	 

}
