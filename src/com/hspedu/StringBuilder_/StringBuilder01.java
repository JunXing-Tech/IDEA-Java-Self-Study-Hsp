package com.hspedu.StringBuilder_;

/**
 * JunXing
 * 2022/12/27 11:03
 * IntelliJ IDEA
 */
public class StringBuilder01 {
    /**
     * 1.StringBuilder继承AbstractStringBuilder
     * 2.实现了Serializable，说明StringBuilder对象可以串行化
     * 3.StringBuilder是final类，不能被继承
     * 4.StringBuilder对象字符序列仍然是
     *      存放在其父类AbstractStringBuilder的char[] value
     * 5.StringBuilder的方法，没有做互斥的处理，即没有synchronized关键字
     *      因此，只推荐在单线程的情况下使用
     */
}
