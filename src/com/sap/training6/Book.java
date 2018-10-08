package com.sap.training6;

public class Book implements Collectable{
	
	private String title;
	private String isbn;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String getUnqiqueId() {
		return isbn;
	}

}
