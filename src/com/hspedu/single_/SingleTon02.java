package com.hspedu.single_;

//public class SingleTon02 {
//    public static void main(String[] args) {
//        Cat instance = Cat.getInstance();
//        System.out.println(instance);
//    }
//}
//
//class Cat {
//    private String name;
//
//    //步骤
//    //1.构造器私有化
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    //2.定义一个static静态属性
//    private static Cat cat;
//    //3.提供一个public的static方法,可以返回一个Cat对象
//    //4.懒汉式，只有用户使用getInstance时，才返回cat对象，后面再次调用时
//    //会返回上次创建的cat对象，从而保证了单例
//    public static Cat getInstance(){
//        if(cat == null){//如果还没有创建cat对象
//            cat = new Cat("xka");
//        }
//        return cat;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}
public class SingleTon02 {
    public static void main(String[] args) {
        //1.仍然構造器私有化
        //2.定義一個 static 靜態屬性對象
        //3.提供一個 public 的 static 方法，可以返回一個 Cat 對象
        //4.懶漢式，只有當用戶使用 getInstance 時，才返回 cat 對象, 後面再次調用時，會返回上次創建的 cat 對象,從而保證了單例

        //直接调用赋值
        Lazy_singleton instance = Lazy_singleton.getInstance();
        System.out.println(instance);
    }
}
class Lazy_singleton{
    private String name;
    //1.构造器私有化
    private Lazy_singleton(String name){
        this.name = name;
    }

    //2.定义一个静态属性对象,不赋值，后面判断时再赋值
    private static Lazy_singleton LS;

    //3.提供public的static方法，可以放回一个对象
    //只有当用户使用getInstance时，才返回对象，后面再次调用时，会返回上次调用对象，保证实现单例
    public static Lazy_singleton getInstance(){
        if(LS == null){
            LS = new Lazy_singleton("zjx");
        }
        return LS;
    }

    @Override
    public String toString() {
        return "Lazy_singleton{" +
                "name='" + name + '\'' +
                '}';
    }

}















































