package com.sap.training6;

import java.util.Collection;
import java.util.HashSet;

public class Person {
	
	private String name;
	private Collection<Collectable> myCollection = new HashSet<>();
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public void addCollectable(Collectable collectable){
		myCollection.add(collectable);
	}
	
	public int getCollectionSize(){
		return myCollection.size();
	}
	
	public Collectable findCollecatableById(String id){
		for (Collectable collectable : myCollection) {
			if(collectable.getUnqiqueId().equals(id)){
				return collectable;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
