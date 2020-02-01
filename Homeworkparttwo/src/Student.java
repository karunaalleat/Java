import java.util.ArrayList;
public class Student extends Demo {
	private String firstName;
	private String batch;
	private  ArrayList<Book> bookCart ;
	public Student(){
		
	}
	public Student(String firstName, String batch) {
		this.firstName = firstName;
		this.batch = batch;
		 bookCart = new ArrayList<Book>();
	}
	public void borrowedBook(Book isBorrow) {
		bookCart.add(isBorrow);
		if(bookCart.add(isBorrow)) {
			System.out.println("This book isn'n Avaible");
		}
		
		if(bookCart.size()>3) {
			System.out.println("You could borrow only maximum 3 books");
		}
	}
	public void returnBook(Book isBorrowed) {
		bookCart.add(isBorrowed);
		if(bookCart.add(isBorrowed)) {
			System.out.println("You didn't borrow this book");
		}
		
	}

	public void getBookCart(ArrayList<Book> bookCart) {
		
		this.bookCart = bookCart;
	}
	@Override
	public String toString() {
		
		return  firstName +" "+ "of class "+ batch +" "+ "has borrowed" ;
	}
}
