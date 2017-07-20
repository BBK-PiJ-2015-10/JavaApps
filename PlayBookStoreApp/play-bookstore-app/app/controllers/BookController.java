package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.data.*;
import javax.inject.Inject;

import java.util.Set;
import java.util.List;

import models.Book;
import views.html.books.*;

public class BookController extends Controller {
	
	@Inject
	FormFactory formFactory;
	

	public Result index(){
		//Set<Book> books = Book.allBooks();
		List<Book> books = Book.find.all();
		return ok(index.render(books));
	}
	
	public Result create(){
		Form<Book> bookForm = formFactory.form(Book.class);
		return ok(create.render(bookForm));
	}
	
	public Result save(){
		Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
		Book book = bookForm.get();
		book.save();
		//Book.add(book);
		return redirect(routes.BookController.index());
	}
	
	public Result edit(Integer id){
		//Book book = Book.findById(id);
		Book book = Book.find.byId(id);
		if (book==null){
			return notFound("Sorry, Book not found");
		}
		Form<Book> bookForm = formFactory.form(Book.class).fill(book);
		return ok(edit.render(bookForm));
	}
	
	public Result update(){
		Book book = formFactory.form(Book.class).bindFromRequest().get();
		//Book oldBook = Book.findById(book.getId());
		Book oldBook = Book.find.byId(book.getId());
		if (oldBook==null){
			return notFound("Sorry, the book wasn't found");
		}
		oldBook.setTitle(book.getTitle());
		oldBook.setAuthor(book.getAuthor());
		oldBook.setPrice(book.getPrice());
		oldBook.update();
		return redirect(routes.BookController.index());
		
	}
	
	public Result destroy(Integer id){
		//Book book = Book.findById(id);
		Book book = Book.find.byId(id);
		if (book==null){
			return notFound("Sorry, the book couldn't be found");
		}
		book.delete();
		//Book.remove(book);
		return redirect(routes.BookController.index());
	}
	
	public Result show(Integer id){
		//Book book = Book.findById(id);
		Book book = Book.find.byId(id);
		if (book==null){
			return notFound("Sorry, the book wasn't found");
		}
		return ok(show.render(book));
	}
	
	
}
