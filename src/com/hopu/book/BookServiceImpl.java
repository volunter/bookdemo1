package com.hopu.book;

import java.util.Map;

public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    public BookServiceImpl() {
        bookDAO = new BookDAOImpl();
    }

    @Override
    public boolean addBook(BookEntity book) {
        if ((bookDAO.findBook(book.getBookId())) == null) {
            bookDAO.addBook(book);
            return true;
        }
        return false;
    }

    @Override
    public BookEntity delBook(Integer bookId) {
        BookEntity book = null;
        if ((book = bookDAO.findBook(bookId)) != null) {
            bookDAO.delBook(bookId);
        }
        return book;
    }

    @Override
    public boolean updateBook(BookEntity book) {
        if (bookDAO.findBook(book.getBookId()) != null) {
            bookDAO.updateBook(book);
            return true;
        }
        return false;
    }

    @Override
    public BookEntity findBook(Integer bookId) {
        return bookDAO.findBook(bookId);
    }

    @Override
    public Map<Integer, BookEntity> getAllBook() {
        return bookDAO.getAllBooks();
    }
}
