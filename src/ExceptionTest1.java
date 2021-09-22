import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一   异常的处理 抓抛沫型
 * 过程一 抛 程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
 * 并将此对象抛出，一旦对象抛出后，就不再执行其后的代码
 * 过程二 抓 可以理解为异常的处理方式 ① try-catch-finally ② throws
 * 二  try -catch -finally 的使用
 * try{
 *     //可能出现异常的代码
 * }catch(异常类型1 变量名1){
 *     //处理异常的方式1
 * }catch(异常类型2 变量名2){
 *     //处理异常的方式2
 * }catch(异常类型3 变量名3){
 *     //处理异常的方式3
 * }
 * ...
 * finally{
 *     //一定会执行的代码
 * }
 *说明：1.finally是可选的
 *     2。异常匹配后，进入catch中进行异常的处理，一旦处理完成，就跳出当前的
 *     try-catch结构(在没有写finally的情况)，继续执行其后的代码
 *     3 catch中的异常类型没有子父类关系，顺序无所谓
 *     catch中的异常类型有子父类关系，子类放上面，否则会报错
 *     4 常用的异常处理的方式 ① String getMessage()
 *                        ② printStackTrace()
 *     体会1： 使用try=-catch-finally 处理编译时异常，是使得程序在
 *     编译时不在报错，但是在运行时仍然可能报错,相当于延迟到运行时出现
 *     体会2 开发中由于运行时异常比较常见，通常不针对运行时异常编写try-catch-finally，
 *     针对编译时异常，要处理。
 *     try-catch-finally的使用
 *     1.finally 是可选的
 *     2 finally 中声明的是一定会被执行的代码，即使catch中又出现了异常，
 *     try中和catch中有return语句等情况
 *     3像数据库连接，输入输出流，网络编程socket等资源，JVM是不能自动回收的
 *     我们需要自己手动的进行资源的释放，此时的资源释放，就需要声明在finally中
 */

public class ExceptionTest1 {
    @Test
    public void test2(){
        FileInputStream fis=null;
        try{
            File file =new File("hello.txt");
            fis =new FileInputStream(file);
            int data =fis.read();
            while(data!=-1){
                System.out.println((char)data);
                data=fis.read();
            }
            //fis.close();
        }catch (
                FileNotFoundException e){
           e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1(){
        String str ="123";
        str ="abc";
        try{
            int num =Integer.parseInt(str);
            System.out.println("hello---1");
        }catch(NullPointerException e){
            System.out.println("出现空指针异常了，不要着急...");
        }catch(NumberFormatException e){
            System.out.println("出现数值转换异常了，不要着急...");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("hello---2");
    }
}
