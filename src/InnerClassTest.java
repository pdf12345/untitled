
/*
类的内部成员之五：内部类
1 java 中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
2 内部类的分类 成员内部类（静态和非静态）VS局部内部类（方法内，代码块内，构造器内）
3 成员内部类
       一方面作为外部类的成员
          >调用外部类的结构
          >可以被static修饰
          >可以被四种不同的权限修饰
       另一方面，作为一个类
          >类内可以定义属性，方法，构造器等
          >可以被final修饰，表示不能被继承
          >可以被abstract修饰
 4 3个问题
 实例化成员内部类
 如何在成员内部类中区分调用外部类的结构
 开发中局部内部类的使用
 */

public class InnerClassTest {
    public static void main(String[] args) {
        Person11.Bird bird=new Person11.Bird();
        bird.sing();
        Person11 p=new Person11();
        Person11.Dog dog=p.new Dog();
        dog.show();
        dog.display("旺财");
    }
}
class Person11{
    String name="小明";
    int age;
    public  void eat(){
        System.out.println("人吃饭");
    }
    //成员内部类
    static class Bird{
        String name;
        int age;
        public void sing(){
            System.out.println("我是一只小小小小鸟");
        }

    }

    class Dog{
        String name="大黄";
        public Dog(){

        }
        public void show(){
            System.out.println("卡拉是条狗");
           Person11.this.eat();
        }
      public void display(String name){
          System.out.println(name);
          System.out.println(this.name);
          System.out.println(Person11.this.name);
      }

    }
    public void method(){
        //局部内部类
        class AA{

        }
    }
    {
        //局部内部类
        class BB{

        }

    }
public Person11(){
    //局部内部类
        class CC{

        }
}
}