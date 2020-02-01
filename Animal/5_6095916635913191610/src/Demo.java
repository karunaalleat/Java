
public class Demo {

	public static void main(String[] args) {
		Student student = new Student ("KayReouy","WEB2019");
		
		Book book1 = new Book("Don’t make me think", "Steve Krung", 2000);
		book1.setBorrowed(true);
		System.out.println(book1.displayEx2());
		
		Book book2 = new Book("Pro Java Programming", "Terrill", 2005);
		book2.setBorrowed(false);
		System.out.println(book2.displayEx2());
		Book book3 = new Book("Programming in Python 3", "Mark Summerfield", 2005);
		book3.setBorrowed(true);
		System.out.println(book3.displayEx2());
		Book book4 = new Book("The Clean Coder", "Robert", 2011);
		book4.setBorrowed(true);
		System.out.println(book4.displayEx2());
		Book book5 = new Book("The Art of Agile Development", "James Shore", 2007);
		book5.setBorrowed(false);
		System.out.println(book5.displayEx2());
		Book book6 = new Book("Head First Design Patterns", "Eric Freeman", 2009);
		book6.setBorrowed(false);
		System.out.println(book6.displayEx2());
		Book book7 = new Book("The Linux Command Line", "Willian", 1993);
		book7.setBorrowed(true);
		System.out.println(book7.displayEx2());
		Book book8 = new Book("Unit Test Patterns", "Steve", 2003);
		book8.setBorrowed(false);
		System.out.println(book8.displayEx2());
		Book book9 = new Book("Unit Test Patterns", "Gerard Meszaros", 2003);
		book8.setBorrowed(false);
		System.out.println(book9.displayEx2());
		Book book10 = new Book("Pro Java Programming", "Terrill", 2013);
		book10.setBorrowed(true);
		System.out.println(book10.displayEx2());
		
		System.out.println("====================================================================================================");
		
		
		
		student.returnBook(book2);
		student.borrowedBook(book2);
		student.returnBook(book4);
		student.borrowedBook(book4);
		student.returnBook(book7);
		student.borrowedBook(book7);

		System.out.println(student);
		System.out.println(book2.getTitle());
		System.out.println(book4.getTitle());
		System.out.println(book7.getTitle());
		book2.isBorrowed();
		book4.isBorrowed();
		book7.isBorrowed();
		
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
	
	}

}
