package com.hspedu.date_;

import java.time.Instant;
import java.util.Date;

/**
 * JunXing
 * 2023/2/21 8:12
 * IntelliJ IDEA
 */
public class Instant_ {
    public static void main(String[] args) {
        /**
         * 1.可通过 Instant 的 now() 方法获取表示当前时间戳的对象
         * 2.通过 from 可以把 Instant 转成 Date
         * 3.通过 date 的 toInstant() 可以把 date 转成 Instant对象
         */
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant instant = date.toInstant();
    }
}
