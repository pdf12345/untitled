/*
final 最终的
1 final 可以修饰类，方法，变量

2 final修饰类：此类不能被其他类继承
              比如 String类 System类 StringBuffer类
 3 final 修饰方法 表明此方法 不可以被重写
 4 final 用来修饰变量：此时的变量称为一个常量
 4.1 final修饰属性，可以考虑的位置有：显式初始化 ，代码块初始化，构造器初始化
 */

public class FinalTest {
}
final class FinalA{

}
//class B extends FinalA{}
class AA{
   final public  void show(){

    }
}
class BB extends AA{
//public  void show(){}
}
