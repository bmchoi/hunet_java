package com.hunet.java.ch07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setBookName("안드로이드이렇게 시작하세요");
		book1.setAuthor("김영아");
		book1.setPublicationDay("2011-4-5");
		book1.setPrice("28000");
		
		Book book2 = new Book();
		book2.setBookName("Getting Start JAVA");
		book2.setAuthor("Dominica");
		book2.setPublicationDay("2012-11-30");
		book2.setPrice("30000");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
	}

}

class Book{
	private String bookName;
	private String author;
	private String publicationDay;
	private String price;
	
	public Book() {}
	public Book(String bookName, String author, String publicationDay, String price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.publicationDay = publicationDay;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicationDay() {
		return publicationDay;
	}
	public void setPublicationDay(String publicationDay) {
		this.publicationDay = publicationDay;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", publicationDay=" + publicationDay + ", price="
				+ price + "]";
	}	
	
}