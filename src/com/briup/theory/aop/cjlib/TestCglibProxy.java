package com.briup.theory.aop.cjlib;

public class TestCglibProxy {
	public static void main(String[] args) {  
        BookServiceProxy cglib=new BookServiceProxy();  
        BookService bookCglib=
        (BookService)cglib.getInstance
        (new BookService());  
        bookCglib.addBook();  
    }  
}
