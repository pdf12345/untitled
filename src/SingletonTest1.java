/*
单例设计模式
1采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
2 饿汉式VS懒汉式
3区分
饿汉式 坏处 对象加载时间长
      好处 饿汉式是线程安全的
懒汉式 好处 延长对象的创建
      目前坏处 线程不安全--->到多线程内容再修改
 */

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank =Bank.getInstance();
        Bank1 bank1 =Bank1.getInstance();
    }
}
//饿汉式
class Bank{
    //私有化构造器
    private Bank(){

    }
    //内部创建类的对象,要求此对象必须声明为静态的
    private static Bank instance=new Bank();
    public  static Bank getInstance(){
        return instance;
    }
}
//懒汉式
class Bank1{
    private  Bank1(){

    }
    private  static  Bank1 instance=null;
    public static Bank1 getInstance(){
        if(instance==null){
            instance=new Bank1();
        }
        return  instance;
    }

}