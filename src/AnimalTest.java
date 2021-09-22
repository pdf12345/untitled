
/*
java 规定的四种权限（从小到大）private default（缺省） protected public
一 构造器的作用
创建对象
二 说明
1.如果没有显示的定义类的构造器，系统默认提供一个空参的构造器
2.定义构造器的格式 权限修饰符 类名（形参列表）{}
3 一个类中定义的多个构造器，彼此构成重载
4 一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器
赋值的顺序
默认初始化
显示初始化
构造器初始化
通过对象.属性和对象.方法初始化
1 this 关键字的使用
this 可以用来修饰 属性，方法，构造器
2 this 修饰属性和方法
this理解为当前对象
3 this 调用构造器
① 我们在类的构造器中，可以显示调用this(形参列表）调用别的构造器
②只能调用其他的构造器，不能调用自己
③如果一个类中有n个构造器，则最多只有n-1构造器中使用了this(形参列表）
④规定this（形参）必须声明在当前构造器的首行
⑤ 构造器中，最多只能声明一个this（形参列表）用来调用其他的构造器
 */


public class AnimalTest {
    public static void main(String[] args) {
        Animal a =new Animal();
        Animal a1 =new Animal("大黄");
        a.name="大黄";
        a.setLegs(4);
        int leg=a.getLegs();
        a.age=3;
        System.out.println("名字："+a.name+",年龄："+a.age+"腿个数："+leg);
    }
}
class Animal{
    String name;
    int age;
    private int legs;
    //构造器
    public Animal(){

    }
    public Animal(String n){
           this();
           this.name =n;
    }
    public Animal(String n,int a){
        this(n);
        //this.name=n;
        this.age =a;
    }
    public void eat(){
        System.out.println("动物进食");
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public int  getLegs(){
        return legs;
    }
}