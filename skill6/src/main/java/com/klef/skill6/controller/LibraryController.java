package com.klef.skill6.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.klef.skill6.model.Book;
@RestController
public class LibraryController {
List<Book> bookList=new ArrayList<>();
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to library";
	}
	@GetMapping("/count")
	public int count() {
		return 50;
	}
	@GetMapping("/price")
	public double price() {
		return 299.99;
	}
	@GetMapping("/books")
public List<String> books(){	
		List<String>list=new ArrayList<>();
		list.add("JFSD");
		list.add("PFSD");
		list.add("MERN STACK");
		return list;
	}
	@GetMapping("/books/{id}")
	public Book bookById(@PathVariable int id) {
		 for (Book b : bookList) {
		        if (b.getId() == id) {
		            return b;
		        }
		    }
		    return null;
	}
	@GetMapping("/search")
	public String search(@RequestParam String title) {
		return "Searching for: "+title;
	}
	@GetMapping("/author/{name}")
	public String author(@PathVariable String name) {
		return "Author name: "+name;
	}
	@PostMapping("/addbook")
	public String addBook(@RequestBody Book book) {
		bookList.add(book);
		return "book Added!";
	}
	@GetMapping("/viewbooks")
	public List<Book> viewBooks(){
		return bookList;
	}
	
}
