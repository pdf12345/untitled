package OverRide;

import org.junit.Test;

public class Man extends Person {
    int id=1001;
    boolean isSmoking;
    public  void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }
    @Test
    public void eat(){
        System.out.println("男人多吃肉");
    }
    public void walk(){
        System.out.println("男人霸气走路");
    }
}
