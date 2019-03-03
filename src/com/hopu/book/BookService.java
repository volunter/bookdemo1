package com.hopu.book;

import java.util.Map;

public interface BookService {
    public boolean addBook(BookEntity book);
    public BookEntity delBook(Integer bookId);
    public boolean updateBook(BookEntity book);
    public BookEntity findBook(Integer bookId);
    public Map<Integer,BookEntity> getAllBook();
}
