package com.neu.webapp.restControllers;


import com.neu.webapp.models.Book;
import com.neu.webapp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;


    // "Post request to create books ";
    @PostMapping("/book")
    public void createBooks(@RequestBody Book book) {
        bookService.CreateBook(book);

    }


    //   "get request to return all the books ";
    @GetMapping("/book")
    public Iterable<Book> getAllBooks() {
        Iterable<Book> allBooks = bookService.getAllBooks();
        return allBooks;

    }


  //PUT request to update all the books
    @PutMapping("/book")

    public Book updateBooks(@RequestBody Book book) {
        bookService.UpdateBook(book);
       return book;
    }


}