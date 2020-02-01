package homework2;

public class Book {
	private String title ;
	private String autor;
	private int publishYear ;
	private boolean isBorrowed = false;
	
	
	Book (String title , String autor ,int publishYear){
		this.title = title;
		this.autor = autor;
		this.publishYear = publishYear;
	}
	void borrow() {
		isBorrowed = true;
	}
	
	void returnBack() {
		isBorrowed = false;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAutor() {
		return autor;
	}
	
	int getPublishYear(){
		return publishYear;
	}
	 
	public String isBorrowed() {
		String borrow;
		if(isBorrowed) {
			borrow = "Not Available";
		}else {
			borrow = "Available";
		}
		return borrow;
	}
	
	public String toString () {
		isBorrowed();
		return "Title: " + title +"\n\t" +"by " + autor+ "--Published: "+ publishYear +"\n\t"+ "Status: "+isBorrowed() + "to borrowed" ; 
	}
}

