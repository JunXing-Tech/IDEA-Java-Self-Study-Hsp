package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JunXing
 * 2023/2/23 11:09
 * IntelliJ IDEA
 */
public class CollectionIterator {
    public static void main(String[] args) {
        //向上转型
         Collection col = new ArrayList();
         col.add(new BOOK("hlm","cxq"));
         col.add(new BOOK("sgyy","lgz"));

        //输出
        System.out.println(col);

        /**
         * 遍历 col 集合
         * 1.先得到 col 对应的 迭代器
         * 2.使用while循环遍历 iterator.hasNext()
         * 3.当退出while循环后，iterator迭代器此时指向最后的元素
         * 如再遍历 则会报错 ： NoSuchElementException
         * 4.如果希望再次遍历，则需要重置迭代器
         * iterator = col.iterator();
         */
        Iterator iterator = col.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        iterator = col.iterator();
    }
}
class BOOK{
    private String bookName;
    private String bookAurthor;

    public BOOK(String bookName, String bookAurthor) {
        this.bookName = bookName;
        this.bookAurthor = bookAurthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAurthor() {
        return bookAurthor;
    }

    public void setBookAurthor(String bookAurthor) {
        this.bookAurthor = bookAurthor;
    }
}

