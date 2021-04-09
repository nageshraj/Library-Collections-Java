package com.wolken.wolkenapp.dto;

public class BookDTO {
	private int bookId;
	private String bookName;
	private String publisher;
	private int price;

	public BookDTO(int bookId, String bookName, String publisher, int price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;

		System.out.println("Book DTO object created");
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
