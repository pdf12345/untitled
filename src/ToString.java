import Bank.bean.Customer;
import org.junit.Test;

/*
Object 类中toString()的使用
1 当我们输出一个对象的引用时，实际上就是调用当前对象的toString（）
2 Object类中的toString()的定义
public String toString(){
return getClass().getName()+"@"+Integer.toHexString(hashCode)
}
3 像 String Data File 包装类都重写了Object类中的toString方法
使得调用对象的toString（）返回实体内容信息
 */
public class ToString {
    public static void main(String[] args) {
        Customer cust1 =new Customer();
        System.out.println(cust1.toString());
        System.out.println(cust1);


    }
}
