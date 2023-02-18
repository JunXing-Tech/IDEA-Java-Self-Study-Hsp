package com.hspedu.enum_;

/**
 * @author JunXing
 * {@code @date} 2022/10/31 9:06
 */
public class EnumDetail {
    public static void main(String[] args) {
        //Music.playing() 相当于 类名直接调用非静态方法，会报错
        //CLASSICMUSIC 为 类的 引用对象 可调用非静态方法
        Music.CLASSICMUSIC.playing();
    }
}
class A {
}
//1.使用 enum 关键字后，就不能再继承其它类了，因为 enum 会隐式继承 Enum，而 Java 是单继承机制
//enum Season3 extends A {
//
//}
//2.enum 实现的枚举类，仍然是一个类，所以还是可以实现接口的.
interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    //public static final Music CLASSICMUSIC = new Music();
    //相当于创建一个Music类的对象 名为 CLASSICMUSIC
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("播放好听的音乐...");
    }
}