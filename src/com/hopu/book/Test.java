package com.hopu.book;

import java.util.Iterator;
import java.util.Map;

public class Test {
    private BookService bookService;
    public Test() {
        bookService = new BookServiceImpl();
    }
    public void print(Map<Integer,BookEntity> books){
        System.out.println("------------------所有书-------------------");
        Iterator<BookEntity> it = books.values().iterator();
        while (it.hasNext()){
            BookEntity book = it.next();
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();

        //添加测试
        System.out.println("添加一本书");
        BookEntity book = new BookEntity(10003, "我爱中国", 10,"共产党" ,"北京大学出版社" , true);
        if (test.bookService.addBook(book)) {
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败");
        }
        test.print(test.bookService.getAllBook());
        //删除测试
        System.out.println("删除一本书");
        System.out.println("删除的书的信息是："+test.bookService.delBook(10002));
        System.out.println("现在书库中的书为：");
        test.print(test.bookService.getAllBook());
        //更新一本书
        System.out.println("修改一本书的信息");
        BookEntity book1 = new BookEntity(10003, "我爱中国", 10,"民主党" ,"北京大学出版社" , true);
        if (test.bookService.updateBook(book1)) {
            System.out.println("更新成功");
        }else{
            System.out.println("更新失败");
        }
        test.print(test.bookService.getAllBook());
        //根据bookId查询一本书
        BookEntity book2 = test.bookService.findBook(10003);
        System.out.println("查询到的书的信息为："+book2);
    }
}
