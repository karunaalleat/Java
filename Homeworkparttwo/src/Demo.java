import java.util.List;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Don't make me think", "Steve Krung", 2000);
	       b1.borrow();
	       Book b2 = new Book("Pro Java Programming", "Terrill", 2005);
	       b2.returnBack();
	       Book b3 = new Book("Programming in Python 3", "Mark Summerfield", 2005);
	       b3.borrow();
	       Book b4 = new Book("The Clean Coder", "Robert", 2011);
	       b4.borrow();
	       Book b5 = new Book("The Art of Agile Development", "James Shore", 2007);
	       b5.returnBack();
	       Book b6 = new Book("Head First Design Patterns", "Eric Freeman", 2004);
	       b6.returnBack();
	       Book b7 = new Book("The Linux Command Line", "Willian", 2009);
	       b7.borrow();
	       Book b8 = new Book("Code Complete", "Steve", 1993);
	       b8.returnBack();
	       Book b9 = new Book("Unit Test Patterns", "Gerard Meszaros", 2003);
	       b9.returnBack();
	       Book b10 = new Book("The C++ Programming Language", "Bjarne Stroustup", 2013);
	       b10.borrow();
	       
	       System.out.println(b1.toString());
	       System.out.println(b2.toString());
	       System.out.println(b3.toString());
	       System.out.println(b4.toString());
	       System.out.println(b5.toString());
	       System.out.println(b6.toString());
	       System.out.println(b7.toString());
	       System.out.println(b8.toString());
	       System.out.println(b9.toString());
	       System.out.println(b10.toString());
	 
	       List<Book> books = new ArrayList<>();
			books.add(b1);
			books.add(b2);
			books.add(b3);
			books.add(b4);
			books.add(b5);
			books.add(b6);
			books.add(b7);
			books.add(b8);
			books.add(b9);
			books.add(b10);
		
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.printf("%1$-30s %2$-20s %3$-20s %4$-20s","TITLE","AUTOR","YEAR","STATUS");
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------- ");
			for( Book Book: books) {
				System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",Book.getTitle(),Book.getAuthor(),Book.getPublicYear(),Book.isBorrowed());
				System.out.println();
				
			}
			System.out.println("------------------------------------------------------------------------------------------");
			
			Student student = new Student("Chanak","WEB2020");
			student.returnBook(b2);
			student.borrowedBook(b2);
			System.out.println(student);
			System.out.println(b2.getTitle());
			System.out.println(b5.getTitle());
			System.out.println(b6.getTitle());
			b2.borrow();
			b5.borrow();
			b6.borrow();
			System.out.println("....................................................................................");
			for(Book book: books){
				System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
						book.getTitle(), book.getAuthor(), book.getPublicYear(), book.isBorrowed());
				System.out.println();
			}
			System.out.println("---------------------------------------------------------------------------------------------");

	}
	}

