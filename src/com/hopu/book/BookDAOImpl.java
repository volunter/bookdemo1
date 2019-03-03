package com.hopu.book;

import java.util.Map;

public class BookDAOImpl implements BookDAO {
    private Map<Integer,BookEntity> books;
    public BookDAOImpl() {
        books = BookStore.allBooks();
    }

    @Override
    public void addBook(BookEntity book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public void delBook(Integer bookId) {
        books.remove(bookId);
    }

    @Override
    public void updateBook(BookEntity book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public BookEntity findBook(Integer bookId) {
        return books.get(bookId);
    }

    @Override
    public Map<Integer, BookEntity> getAllBooks() {
        return books;
    }
}
