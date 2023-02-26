package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * JunXing
 * 2023/2/25 9:21
 * IntelliJ IDEA
 */
public class LIstExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Book("hlm", "cxq", 100));
        list.add(new Book("xyj", "wce", 10));
        list.add(new Book("swz", "sna", 9));
        list.add(new Book("sgyy", "lgz", 80));

        Bubble(list);

        System.out.println(list);

    }
    public static void Bubble(List list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                /**
                 * 集合遍历 冒泡排序
                 */
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);

                if(book1.getBookPrice() > book2.getBookPrice()){
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
class Book{
    private String author;
    private String bookName;
    private int bookPrice;

    public Book(String author, String bookName, int bookPrice) {
        this.author = author;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}