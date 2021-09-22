/*
变量的使用
1 java定义变量的格式：数据类型 变量名 =变量值;
2 说明
 >变量必须先声明后使用
 >变量定义在其作用域内，在作用域内有效，出了作用域无效。
 >同一个作用域不能声明两个同名变量。
 */
/*
3 java定义的数据类型
    ① 按照数据类型来分：
基本数据类型
整型 byte\short\int\long
浮点型 float\double
字符型 char
布尔型 boolean

引用数据类型
类(class)
接口(interface)
数组(array)
    ② 按照在类中的声明位置来分
    成员变量 和 局部变量
4 基本数据类型之间的运算规则
 前提 ：不包含boolean类型
 ① 自动类型提升
 byte,char,shot -->int-->long-->float-->double
 当byte，char，short三种类型的变量做运算时，结果为int型
 ②强制类型转换:自动类型提升运算的逆运算
  需要使用强转符()
  可能导致精度损失
补充： 整型常量默认为int 浮点型常量默认为double。
 */

public class VariableTest {
    public static void main(String[] args) {
        int myAge =12;
        System.out.println(myAge);
        //1.整型 byte(1字节=8bit)\short(2字节）\int(4字节)\long(8字节）
        // ① byte 范围 -128-127
        byte b1 =12;
        byte b2 =-128;
       // byte b3=128;
        //②声明long型变量必须以“l”或者“L”结尾
        //③通常定义整型变量使用int型
        short s1 =128;
        int i1 =1234;
        long l1 =123456768L;
        //2.浮点型 float (4字节)\double(8字节）
        //浮点型表示带小数点的数值
        //float表示的数值范围比long还大
        //float类型变量末尾以“f"或者”F“结尾
        float f1 =12.3f;         //float f1 =12.3;
        System.out.println(f1);
        //3.字符型 (1字符=2字节)
        //①定义char类型变量，一般使用一对‘’，内部只能写一个字符
        char c1 ='a';
        char c2='中';
        System.out.println(c1);
        System.out.println(c2);
        //② 表示方式 1， 声明一个字符，2，转义字符
        char c3 ='\n';
        char c4 ='\t';
        //4.布尔型 boolean
        //只能取true\false
        //常常在条件判断，循环语句中使用
        boolean bb1 =true;
        boolean isMarried =true;
        if(isMarried)
        {
            System.out.println("你不能参加\"单身\"party了");
        }
        byte b11=10;
        char c11='a';
        //char c22=b11+c11;
        //byte b22=b11+c11;
        //short s11 =b11+c11;
        int i11 =b11+c11;
    }
}
