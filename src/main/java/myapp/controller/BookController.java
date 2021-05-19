package myapp.controller;

import myapp.model.entity.Book;

public class BookController {

    void create(Request req) {
        Book book = new Book();
        book.setTitle(req.getParameter("title"));

    }


}
