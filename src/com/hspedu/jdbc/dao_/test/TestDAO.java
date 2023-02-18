package com.hspedu.jdbc.dao_.test;

import com.hspedu.jdbc.dao_.dao.ActorDAO;
import com.hspedu.jdbc.dao_.domain.Actor;

import java.util.List;

/**
 * JunXing
 * 2022/12/9 11:06
 * IntelliJ IDEA
 */
public class TestDAO {
    public static void main(String[] args) {
        ActorDAO actorDAO = new ActorDAO();

        //查询多行记录
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.print("---查询多行结果---");
        for(Actor actor : actors){
            System.out.print(actor);
        }
        System.out.println("");

        //查询单行记录
        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 1);
        System.out.print("---查询单行结果---");
        System.out.print(actor);
        System.out.println("");

        //查询单行单列
        Object o = actorDAO.queryScalar("select name from actor where id = ?", 1);
        System.out.println("---查询单行单列结果---");
        System.out.print(o);
        System.out.println("");

        //DML操作 insert update delete
        int update = actorDAO.update("insert into actor values(null, ?, ?, ?, ?)","eee", "男", "1122-11-22", "465");
        System.out.println("---DML操作成功---");
        System.out.print(update);
    }
}
