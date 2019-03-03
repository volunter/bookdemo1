package com.hopu.book;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    /** 书库
     * @return  现有的所有书
     */
    public static Map<Integer,BookEntity> allBooks(){
        Map<Integer,BookEntity> books = new HashMap<>();
        books.put(10001, new BookEntity(10001, "西游记", 13.4f, "吴承恩", "电子工业出版社", true));
        books.put(10002, new BookEntity(10002, "三国", 10.0f, "罗贯中", "清华出版社", false));
        return books;
    }
}
