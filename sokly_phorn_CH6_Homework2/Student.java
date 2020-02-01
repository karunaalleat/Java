package homework2;

import java.util.ArrayList;
public class Student {
	private String firstName;
	private String batch;
	private  ArrayList<Book> bookCart ;
	
	
	
	Student (String firstName , String batch) {
		this.firstName = firstName;
		this.batch = batch;
		bookCart = new ArrayList<Book>();
	}
	
	public void borrowedBook(Book book ) {
		bookCart.add(book);
		if(bookCart.size()>3) {
			System.out.println("You could borrow only maximum 3 books");
		}
	}
	
	public void returnBook(Book borrowed) {
		bookCart.add(borrowed);
		if(bookCart.add(borrowed)) {
			System.out.println("You didn't borrow this book");
		}
	}
	
	public void getBookCart(ArrayList<Book> bookCart) {
		
		this.bookCart = bookCart;
	}
	
	@Override
	public String toString() {
	
		return  firstName + " of class "+ batch+ " has borrowed:";
	}
}
