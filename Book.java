import java.util.*;


public class Book extends Library{
	
	
	private int bookId;
	private String bookName;
    private String bookAuthor;
    private boolean available;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
 public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
Book(int bookId , String bookName , String bookAuthor, boolean available ){
	  
		this.bookId = bookId;
		this.bookName = bookName; 
		this.bookAuthor = bookAuthor;
		this.available = available;
	}

	



}



	
	



