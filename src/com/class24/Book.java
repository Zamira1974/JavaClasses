package com.class24;

/*Write program as a Book class that will have 2 Constructors. 
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed 
 */

public class Book {
	String author;
	String bookName;
	int publishedYear;
	int pages;
	
	
	Book(String author, String bookName){
		this.author=author;
		this.bookName=bookName;
	}
	Book (String author, String bookName, int pages, int publishedYear) {
		this.author=author;
		this.bookName=bookName;
		this.publishedYear=publishedYear;
		this.pages=pages;
	}

	public void Show() {
		System.out.println("Name of the book is: "+bookName+" and author is: "+author);
	}
	
	public void ShowInfo() {
		System.out.println("Name of the book is: "+bookName+" and author is: "+author+" published in "+publishedYear+" and book contains "+pages+" pages");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("T.Harv Eker ", "\"Millionaire Mind\"", 310, 2010);
		book1.Show();
		book1.ShowInfo();

		Book book2 = new Book("Brain Tracy", "\"Stop procrastinating\"", 350, 2016);
		book2.Show();
		book2.ShowInfo();
	}	
}
