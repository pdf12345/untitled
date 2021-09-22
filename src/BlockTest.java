/*
代码块
1代码块的作用 用来初始化类或者对象
2 代码块如果有修饰只能用static
3 分类 静态代码块 VS非静态代码块
4 静态代码块>内部可以有输出语句
          >随着类的加载而执行，而且只会执行一次
          >一个类中定义了多个静态代码块，按顺序执行
          >静态代码块优先于非静态代码块执行
 5 费静态代码块>内部可以有输出语句
          >随着类的创建对象而执行，而且每创建一个对象就会执行一次
          >可以在创建对象时对对象的属性等进行初始化
 */
public class BlockTest  {
    public static void main(String[] args) {
        String desc =Person.desc;
        Person p1 =new Person();
    }
}
class Person{
    String name;
    int age;
    static  String desc ="我是一个人";
    public Person(){
    }
    public Person(String name ,int age){
        this.name=name;
        this.age=age;
    }
    //代码块
    static {
        System.out.println("Hello,static block");
    }
    {
        System.out.println("Hello,block");
    }
    public  void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}