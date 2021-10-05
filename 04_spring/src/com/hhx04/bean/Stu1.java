package com.hhx04.bean;

import java.util.List;

/**
 * @author hhxStellar
 * @date 2021/9/11-19:36
 */
public class Stu1 {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Stu1{" +
                "books=" + books +
                '}';
    }
}
