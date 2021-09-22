/*
while和do-while循环结构的使用
一 循环结构的4个要素
① 初始化条件
②循环条件
③循环体
④迭代条件
while循环
①
while (②)
{
③;
④;
}

do-while循环
①
do{
③;
④；
}while(②);
写while循环时千万小心不要丢了迭代条件，否则容易导致死循环。
 */
public class WhileTest {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        int num=1;
        int sum=0;
        int count=0;
        do{
            if(num%2==0){
                System.out.println(num);
                sum+=num;
                count++;
            }
            num++;
        }while(num<=100);

    }
}
