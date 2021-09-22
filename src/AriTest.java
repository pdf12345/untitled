/*
运算符之一 ：算术运算符
+ - * / % 前++ 后++ 前-- 后--  +
前++ 先自增1后运算  前-- 先自减后运算
后++ 先运算后自增   后-- 先运算后自减
运算符之二 ：赋值运算符
= += -= *= /= %=
运算符之三： 比较运算符
==  ！= > < >= <= instanceof

运算符之四 逻辑运算符
& && | ||  ! ^
运算符之五 位运算符
<< >>  >>> & | ^ ~
运算符之六 三元运算符
(条件表达式)？表达式1：表达式2
根据条件表达式的结果来执行表达式1或者表达式2
三元运算符可以嵌套
凡是可以使用三元运算符的地方都可以使用if-else，反之不成立，如果都可以使用，优先使用三元运算符，执行效率高。
 */
public class AriTest {
    public static void main(String[] args) {
        int num1 =12;
        int num2 =5;
        int result1 =num1/num2;
        int result2 =num1/num2*num2;
        double result3 =num1/num2;
        double result4 =num1/num2+0.0;
        double result5 =num1/(num2+0.0);
        double result6=(double) num1/num2;
        System.out.println(result6);
        //% 运算,结果符号 与被取余数符号一致。
        int m1=12;
        int n1 =5;
        System.out.println("m1 % n1 ="+ m1 % n1);
        int m2=-12;
        int n2 =5;
        System.out.println("m2 % n2 ="+ m2 % n2);
        int m3=12;
        int n3 =-5;
        System.out.println("m3 % n3 ="+ m3 % n3);
        int m4=-12;
        int n4 =-5;
        System.out.println("m4 % n4 ="+ m4 % n4);
        //m1 % n1 =2
        //m2 % n2 =-2
        //m3 % n3 =2
        //m4 % n4 =-2

        //赋值运算符
        int i1=10;
        int j1=10;
        //连续赋值
        int i2 ,j2;
        i2=j2=10;
        int i3=10,j3=20;
        short s1 =10;
        s1+=2;//不改变变量本身的数据类型
        //s1=s1+2;编译不通过
        //获取两个整数的较大值
        int m=12;
        int n=5;
        int max =(m>n)?m:n;
        System.out.println(max);
    }
}
