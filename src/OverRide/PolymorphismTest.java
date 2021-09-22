package OverRide;
/*
面向对象特征之三 多态性
1可以理解为一个事物的多种形态
2何为多态性 父类的引用指向子类的对象
3 多态的使用 虚拟方法的调用
有了对象多态性以后，我们在编译期，只能调用父类中声明的方法，但在实际执行时执行的是子类重写父类的方法
总结，编译看左边，执行看右边。
4 多态性 使用的前提，①类的继承关系②方法的重写
5 对象的多态性只适应于方法不适用于属性
 */
public class PolymorphismTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.eat();
        Man man =new Man();
        man.eat();
        man.age=25;
        man.earnMoney();
        //对象的多态性：父类的引用指向子类的对象===============================
        Person p2 =new Man();
        Person p3 =new Woman();
        p2.eat();
        System.out.println(p2.id);
        Man m1=(Man)p2;
        m1.isSmoking=true;
        /*
        instanceof 判断a是否是A的实例
        使用情境 为了避免向下转型时出现ClassCastException的异常，进行instanceof判断
         */
        if(p2 instanceof Woman) {
            Woman m2 =(Woman)p2 ;
        m2.isBeauty=true;
        }
    }
}
