/*
static 关键字的使用
1 static  静态的
2 static 可以 用来修饰 属性 方法 代码块 内部类
3 用 static 修饰属性 ：静态变量（类变量）
3.1属性按是否用static 修饰又分为静态属性和非静态属性（实例变量）
实例变量 ：我们创建了类的多个对象 每个对象都独立拥有一套类中的非静态属性，当修改其中一个对象的非静态属性
不会导致其他对象中同样的属性值的修改
静态变量：我们创建了类的多个对象 多个对象共享同一个静态变量，当通过某一个对象修改静态变量时，其他对象
调用此静态变量时，是修改过了的。
3.2静态变量随着类的加载而加载，可以通过类.静态变量的方式进行调用
静态变量的加载要早于对象的创建
由于类只会加载一次，则静态变量只会在内存中加载一次，存在方法区的静态域中。
4 使用 static修饰方法 ：静态方法
静态方法通过类的加载而加载
静态方法只能调用静态变量，非静态方法都可以调用
5 注意点
在静态方法内不能使用this,super关键字
6 开发中如何确定一个属性是否要声明为static
 >属性可被多个对象而共享，不会随着对象不同而不同的
开发中如何确定一个方法是否要声明为static
> 操作静态属性的方法，通常设置为static
工具类中的方法，习惯上设置为static比如Math，Array,Collections等
 */
public class StaticTest {
    public static void main(String[] args) {
         Chinese.show();
         Chinese c1 =new Chinese();
         c1.name ="姚明";
         c1.age=40;
         Chinese c2 =new Chinese();
         c2.name="马龙";
         c2.age=30;
         c1.nation="CHN";
        System.out.println(c2.nation);
    }
}
class Chinese {
    String name;
    int age;
    static String nation;
    public static void show(){
        System.out.println("我是一个中国人");
        //name="Tom";
        System.out.println(Chinese.nation);
        walk();
    }
    public static void walk(){

    }
}