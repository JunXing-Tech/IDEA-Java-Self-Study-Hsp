package com.hspedu.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JunXing
 * 2023/2/17 15:33
 * IntelliJ IDEA
 */
public class ArrayExercise {
    public static void main(String[] args) {
        //创建一个大小为4的对象数组
        Book[] books = new Book[4];
        books[0] = new Book("hlm", 100);
        books[1] = new Book("jpmx", 90);
        books[2] = new Book("qnwz20n", 5);
        books[3] = new Book("javacrmdfq", 300);

        /**
         * 使用Arrays.sort()方法定制排序方法
         * 使用匿名内部类
         * Object o1 与 Object o2 分别表示2个数组对象
         * 将Object强转为对象数组类
         * 从小到大
         */
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                //根据书的价格排序
                //double diff = book1.getBookPrice() - book2.getBookPrice();
                //根据书的名字长度排序
                double diff = book1.getBookName().length() - book2.getBookName().length();
                if(diff > 0){
                    return 1;
                } else if (diff <0) {
                    return -1;
                } else{
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

//创建Book类
class Book{
    //定义对象数组内属性
    private String bookName;
    private double bookPrice;

    //构造器
    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    //get set 方法
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    //重写tostring方法
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}

