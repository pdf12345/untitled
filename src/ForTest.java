/*
for循环结构的使用
一 循环结构的4个要素
① 初始化条件
②循环条件
③循环体
④迭代条件
for(①;②;④)
{
③
}
 */
public class ForTest {
    public static void main(String[] args) {
        //遍历100以内的偶数
        int sum=0;
        for(int i=1;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                sum+=1;
            }
        }
        System.out.println("总和为："+sum);
        //九九乘法表
        for (int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(i+" * "+j+" = "+(i*j)+"  ");
            }
            System.out.println();
        }
        //输出100以内的质数
        int count =0;
       label: for(int i=2;i<=100;i++){
            for(int j=2;j<Math.sqrt(i);j++){
              if(i%j==0){
              continue label;//跳过指定循环
              }
            }
                count++;
            }
        System.out.println("100以内的质数个数为：" +count);
        }
    }

