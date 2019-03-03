package com.hopu.book;

import java.util.Map;

public interface BookDAO {
    public void addBook(BookEntity book);
    public void delBook(Integer bookId);
    public void updateBook(BookEntity book);
    public BookEntity findBook(Integer bookId);
    public Map<Integer,BookEntity> getAllBooks();
}
