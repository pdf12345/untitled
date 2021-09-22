/*
String 类型变量的使用
1. String 变量属于引用数据类型
2 .声明String 变量时，使用一对“”
3 String 可以和8种基本数据类型做运算，且只能为连接运算：+

 */

public class StringTest {
    public static void main(String[] args) {
        String s1 ="HelloWorld!";
        System.out.println(s1);
        int num =1001;
        String numberStr ="学号：";
        String info =numberStr+num;
        System.out.println(info);
          String str1 =123+"";
        System.out.println(str1);
        int num1 =Integer.parseInt(str1);
    }
}
