package homework2;
import java.util.ArrayList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Book book1 = new Book("Don't make me think ","Steve Krun",2000);
				book1.borrow();
				
				Book book2 = new Book("JavaProgramming","Terril",2005);
				book2.returnBack();
				
				Book book3 = new Book("Programming in Python 3 ","Mark Summerfield",2005);
				book3.borrow();
				
				Book book4 = new Book("The Clean Coder ","Robert",2011);
				book4.borrow();
			
				Book book5 = new Book("The Art of Agile Development ","James Shore",2007);
				book5.returnBack();
				
				Book book6 = new Book("Head First Desing Patterns ","Eric Freeman",2004);
				book6.returnBack();
				
				Book book7 = new Book("The Linux Command line ","William",2009);
				book7.borrow();
			
				Book book8 = new Book("Code Complete ","Steav",1993);
				book7.borrow();
		
				Book book9 = new Book("Unit Test Pattern ","Gerard Meszaros",2003);
				book9.returnBack();
			
				Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
				book10.borrow();
				System.out.println();
				
				List<Book> books = new ArrayList<>();
				
				books.add(book1);
				books.add(book2);
				books.add(book3);
				books.add(book4);
				books.add(book5);
				books.add(book6);
				books.add(book7);
				books.add(book8);
				books.add(book9);
				books.add(book10);
				
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				System.out.printf("%1$-30s %2$-20s %3$-20s %4$-20s","TITLE","AUTOR","YEAR","STATUS");
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				for( Book Book: books) {
					System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
						Book.getTitle(),Book.getAutor(),Book.getPublishYear(),Book.isBorrowed());
					System.out.println();
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------");
				Student student = new Student("Sokly phorn","WEB2020B");
				
				student.returnBook(book2);
				student.borrowedBook(book2);
			
				System.out.println(student);
				
				System.out.println(book2.getTitle());
				System.out.println(book4.getTitle());
				System.out.println(book7.getTitle());
				book2.isBorrowed();
				book4.isBorrowed();
				book7.isBorrowed();
				
				
				
				
	
	}

}
