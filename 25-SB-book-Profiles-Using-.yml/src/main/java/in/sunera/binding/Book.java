package in.sunera.binding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS_DTLS")
public class Book {

	@Id
	@Column(name="BOOK_NAME")
	private String bookName;
	@Column(name="AUTHOR_NAME")
	private String authorName;
	@Column(name="BOOK_PRICE")
	private Double bookPrice;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", bookPrice=" + bookPrice + "]";
	}
	public Book(String bookName, String authorName, Double bookPrice) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}
	public Book() {
		
	}
	
	
	
	
}
