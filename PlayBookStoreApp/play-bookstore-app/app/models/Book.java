package models;

import java.util.Set;
import java.util.HashSet;

import io.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends Model {
	
	@Id
	private Integer id;
	
	private String title;
	
	private Integer price;
	
	private String author;
	
	//We are defining the Finder for this class, the first parameter is the primary key type, the second is the class
	public static Finder<Integer,Book> find = new Finder<>(Book.class);
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	/*
	
	private static Set<Book> books;
	
	static {
		books = new HashSet();
		books.add(new Book(1,"Java",200,"Palacios"));
		books.add(new Book(2,"Scala",300,"Mimadito"));
	}
	
	public Book(){
		
	}

	public Book(Integer id, String title, Integer price, String author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	
	
	public static Set<Book> allBooks(){
		return books;
	}
	
	public static Book findById(Integer id){
		for (Book book: books){
			if (book.id.equals(id)){
				return book;
			}
		}
		return null;
	}
	
	public static void add(Book book){
		books.add(book);
	}
	
	public static Boolean remove(Book book){
		return books.remove(book);
	}
	
	
	*/
	
	
	

}
