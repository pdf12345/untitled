package OverRide;

public class Person {
    String name;
    int age;
    int id=1002;
    public Person(){
       // System.out.println("我无处不在");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("人：吃饭");

    }
    public void walk(){
        System.out.println("人：走路");
        show();
    }
    private void show()
    {
        System.out.println("我是一个人");
    }
}
