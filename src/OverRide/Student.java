package OverRide;

public class Student extends Person {
    String major;
    int id=1001;
    public Student(){

    }

    public Student(String name,int age,String major) {
        super(name,age);
        this.major = major;
    }
    public  void study(){
        System.out.println("学习，专业是："+major);
    }
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    @Override
    public void walk() {
        super.walk();
    }
    //private不能重写
    public void show(){
    System.out.println("id="+id);
        System.out.println(this.id);
        System.out.println(super.id);
}
}
