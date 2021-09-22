package com.pd.java;
/**
 * 创建三个窗口卖票吗，总票数为100张使用runnable接口的方式
 *在java中，我们通过同步机制，来解决线程的安全问题
 * 方式一 ：同步代码块
 * synchronized(同步监视器）{
 *     //需要被同步的代码（操作共享数据的代码称为同步代码）
 * }
 * 说明 1.操作共享数据的代码，即为需要被同步的代码
 *     2.共享数据：多个线程共同操作的变量。
 *     3.同步监视器，俗称：锁。任何一个类的对象都可以充当锁
 *     要求：多个线程必须公用同一把锁
 *方式二:同步方法
 *如果操作共享数据的代码完整的声明在一个方法中，我们可不妨将此代码声明成同步的
 * 同步方式：解决了线程的安全问题
 * 操作同步代码时，只能有一个线程参与，其他线程等待，相当于是一个单线程的过程，效率低。
 */
class Window1 implements Runnable{
    private  int ticket =100;
    //Object obj =new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w =new Window1();
        Thread t1 =new Thread(w);
        Thread t2 =new Thread(w);
        Thread t3 =new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
