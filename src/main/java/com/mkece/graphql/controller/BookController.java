package com.mkece.graphql.controller;


import com.mkece.graphql.model.Book;
import com.mkece.graphql.model.BookInput;
import com.mkece.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput bookInput) {
        return bookService.createbook(bookInput);
    }

    @QueryMapping("getBookById")
    public Book getBookById(@Argument int bookId) {
        return bookService.getBook(bookId);
    }

    @QueryMapping("allBooks")
    public List<Book> getBooksList() {
       return  bookService.getallBooks();
    }


    @MutationMapping("updateBook")
    public Book updateBook(@Argument  BookInput bookInput){
        return bookService.updateBook(bookInput);
    }


    @MutationMapping("deleteBook")
    public boolean deteBookById(@Argument int bookId){
        return bookService.deleteBook(bookId);
    }

}