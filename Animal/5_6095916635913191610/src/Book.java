import java.text.Format;
public class Book {
 private String title;
 private String author;
 private int publicYear;
 private boolean isBorrowed;
 public Book() {
	 
 }
 public Book(String title,String author,int publicYear) {
	 this.title = title;
	 this.author = author;
	 this.publicYear = publicYear;
 }
 public void borrow() {
	 if(isBorrowed ==true) {
		System.out.println("Yes");
	 }
 }
 public void returnback() {
	 if(isBorrowed==false) {
		 System.out.println("No");
	 }
 }

public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public int getPublicYear() {
	return publicYear;
}
public boolean isBorrowed() {
	if(this.isBorrowed) {
		System.out.println("Not Avariable");
	}
	return isBorrowed;
	
	
}
public void setBorrowed(boolean isBorrowed) {
	this.isBorrowed = isBorrowed;
}
public void setTitle(String title) {
	this.title = title;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setPublicYear(int publicYear) {
	this.publicYear = publicYear;
}
@Override
public String toString() {
	
	return  title + author  + publicYear  + isBorrowed;
	
}

public String displayEx2() {
	String result = "Title: " + this.getTitle()+
			" by " + this.getAuthor() +
			" -- Publiced " + this.getPublicYear() +
			" Status: ";
	if(this.isBorrowed) {
		result += "Not available to Borrow";
	} else {
		result += "Available to Borrow";
	}
	return result ;
} 



}

