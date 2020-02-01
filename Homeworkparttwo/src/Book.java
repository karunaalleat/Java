
public class Book {
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed = true;
	 	 
	 public Book(String title, String author, int publishYear) {
		 this.title = title;
		 this.author = author;
		 this.publishYear = publishYear;
	 }
   
   //get title
   String getTitle() {
	  return title;
  }
   //get author
   String getAuthor() {
	  return author;
  }
 
   //get publicYear
    int getPublicYear() {
	  return publishYear;
  }
    // method
  void returnBack() {
	  isBorrowed = false;
  }
  //method
  void borrow() {
	isBorrowed = true;
  }
   public String isBorrowed() {
	   String result ;
	    if(isBorrowed) {
	    	result= "Not available  ";
	    }else {
	    	result =" Available " ;
	    }
	    
	    return result; 
  }
  public String toString() {
	   isBorrowed();
	    
	    return ("Title : "+title +"\n"  + "\t"+ "by" + " " + author+"--published" + publishYear+"\n" +"\t"+  "Status :"+ isBorrowed()+" "+"to Borrow");
	}
}
