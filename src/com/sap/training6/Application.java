package com.sap.training6;

public class Application {

	public static void main(String[] args) {

		Person john = new Person("John");
		
		Computer macbook = new Computer();
		macbook.macAddress = "ABCDE";
		macbook.cpuCores = 8;
		macbook.memory = 4096;
		
		Book harryPotter = new Book("Harry Potter");
		harryPotter.setIsbn("12345");

		john.addCollectable(macbook);
		john.addCollectable(harryPotter);
		
		System.out.println("John has "+ john.getCollectionSize() + "items collected");
		Collectable computer = john.findCollecatableById("ABCDE");		

	}

}