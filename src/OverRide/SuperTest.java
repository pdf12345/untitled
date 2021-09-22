package OverRide;
/*
super关键字的使用
1 super 理解为父类的
2 super可以用来调用：属性，方法
3 super 的使用
3.1 我们可以在子类的方法或者构造器中，使用super.属性 或者super.方法的方式显示的调用父类
中声明的属性或者方法，但是通常情况下，我们习惯省略super.
3.2 特殊情况下，当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须
显示的使用super.属性的方式表明调用的是父类中声明的属性。
3.3 特殊情况，当子类中重写了父类中的方法后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式
的使用super.方法的方式，表明时父类中被重写的方法。
4 super 调用构造器
4.1 我们在子类的构造器中显式的使用“super(形参列表）”的方式，调用父类中声明的指定的构造器
4.2 super(形参列表）的使用，必须声明在子类构造器的首行
4.3 我们在类的构造器中，针对this(形参列表）或者super(形参列表）只能二选一，不能同时出现
4.4在构造器的首行没有显式的声明this(形参列表）或者super(形参列表），默认调用父类的空参构造器super（）。

 */
public class SuperTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();
        Student s1=new Student("TOM",21,"it");
        s1.show();
    }
}
