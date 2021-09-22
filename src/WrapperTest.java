import org.junit.Test;

/*
java 提供了8中基本类型数据类型对应的包装类，使得基本数据类型具有类的特征
2 掌握 基本数据类型 包装类 String 三者之间的转换
 */
public class WrapperTest {
    //基本数据类型，包装类<---->String类型
    @Test
    public  void test3(){
        int num1 =10;
        String str1 =num1+"";//方法1 连接运算
        String str2=String.valueOf(num1);//方法2 调用 String 的valueOf()
        Integer in2 =num1;
        String str4 =in2.toString();
        String str3 ="123";
        int in1 =Integer.parseInt(str3);//调用包装类的parseXxx(String s)
    }
//包装类--->基本数据类型,调用包装类的xxxValue()
    @Test
    public  void test2(){
        Integer in1=new Integer(12);
        int i2 =in1;//自动拆箱
        int i1=in1.intValue();
        method(i1);
        System.out.println(i1);

    }
    //基本数据类型--->包装类 调用包装类的构造器
    @Test
    public  void test1(){
        int num1 =10;
        Integer in1=new Integer(num1);
        Integer in3 =num1;//自动装箱
        System.out.println(in1.toString());
        Integer in2 =new Integer("123");
        System.out.println(in2.toString());

    }
public  void  method(Object obj)
{
    System.out.println(obj);
}
}
