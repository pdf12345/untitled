/*
对第一个java程序进行总结
1 java程序编写 -编译-运行的过程
编写： 讲编写好的代码保存在".java"结尾的源文件中
编译： 使用javac.exe 命令编译我们的java源文件。 格式 : javac 源文件名 .java
运行： 使用java.exe 命令解释运行我们的字码文件。格式 ： java 类名

2 在一个java源文件中可以声明多个class ,但是最多只有一个类声明为public,这个类为文件的同名类。

3 程序的入口是main()方法，格式固定

4 输出语句 System.out.println(); 输出后换行
         System.out.print();
5 每一行执行语句都以";"结束

6编译的过程，编译以后，会生成一个或者多个字节码文件，字节码的文件名与java源文件的类名一致
 */


public class Hello {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
