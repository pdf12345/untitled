/*
abstract 关键字的使用
1 abstract：抽象的
2 abstract可以用来修饰的结构：类 方法
3 abstract 修饰类：抽象类
             此类不可实例化
             抽象类中一定有构造器，便于子类实例化调用
             开发中都会提供抽象类的子类，让子类对象类实例化
4 abstract 修饰方法 ：抽象方法
                    抽象方法只有方法的声明。没有方法体
                    包含抽象方法的类，一定是一个抽象类，反之不一定
                    子类重写父类所有的抽象方法后，子类可以实例化
                    若没有重写父类的所有抽象方法，则仍然为抽象类

5 abstract使用的注意点
abstract不能用来修饰属性和构造器等结构
abstract不能用来修饰私有方法，静态方法，final的方法
 */

public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person1 类抽象了，就不能实例化;
        //Person1 p1 =new Person1();
        //p1.eat();
    }
}
 abstract class Person1{
    String name;
    int age;
    public Person1(){

    }
    public Person1(String name,int age){
    this.name=name;
    this.age=age;
    }
//    public void eat(){
//       // System.out.println("人吃饭");
//    }
    //抽象方法
    public abstract void eat();
    public  void walk(){
        System.out.println("人走路");
    }
}
class Student1 extends Person1{
    public Student1(String name ,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

}
