package com.mkece.graphql.service;

import com.mkece.graphql.model.Book;
import com.mkece.graphql.model.BookInput;

import java.util.List;

public interface BookService {


    // create book
    public Book createbook( BookInput bookInput);

    // get book by id

    public Book getBook(int id);


    // get all boooks
    public List<Book> getallBooks();

    // update book
    Book updateBook(Book book);

    boolean deleteBook(int id);

}
