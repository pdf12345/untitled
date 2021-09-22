/*
异常体系结构
java.lang.Throwable
        java.lang.Error:一般不编写针对性的代码进行处理
        java.lang.Exception：可以进行异常的处理
               -----编译时异常（check）
                  IOException
                  FileNotFoundException
                  ClassNotFoundException
               -----运行时异常
                 NullPointerException
                 ArrayIndexOutOfBoundsException
                 ClassCastException
                 NumberFormatException
                 InputMismatchException
                 ArithmeticException
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
    //编译异常
    @Test
    public void test7(){
//        File file =new File("hello.txt");
//        FileInputStream fis =new FileInputStream(file);
//        int data =fis.read();
//        while(data!=-1){
//            System.out.println((char)data);
//            data=fis.read();
//        }
//        fis.close();

    }
    // ArithmeticException
    @Test
    public void test6(){
      int a=10;
      int b=0;
        System.out.println(a/b);
    }
    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner =new Scanner(System.in);
         int score=scanner.nextInt();
        System.out.println(score);
    }
    //NumberFormatException
    @Test
    public void test4(){
      String str ="abc";
              int num =Integer.parseInt(str);
    }
    //ClassCastException
    @Test
    public void test3(){
        Object obj =new Date();
        String str =(String) obj;
    }
    //ArrayIndexOutOfBoundsException
    @Test
    public void test2(){
        int []arr =new int[10];
        System.out.println(arr[10]);
    }
    //NullPointerException
    @Test
    public void test1(){
        int []arr =null;
        System.out.println(arr[3]);
    }
}
