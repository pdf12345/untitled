package com.pd.java;

/**
 * 多线程的创建 方式一 继承与Thread类
 * 1创建一个继承于Thread类的子类
 * 2 重写Thread类的run()
 * 3创建Thread类的子类的对象
 * 4 通过此对象调用start()
 *
 */
//1创建一个继承于Thread的子类
class MyThread extends Thread{
    //2重写Thread的run()
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3创建Thread类的子类的对象
        MyThread t1 = new MyThread();
        //4 通过此对象调用start()
        //问题一 不能通过直接调用run()方法启动线程
        t1.start();
        //问题二 再启动一个线程，不可以让已经start()的线程再次start()
        //需要重新创建一个线程对象
        MyThread t2 = new MyThread();
        t2.start();
        System.out.println("Hello");
    }
}
