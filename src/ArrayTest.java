/*
一 数组的概述
1 数组的理解 数组（Array) ,是多个相同类型的数据按照一定顺序排列的集合，并使用一个名字命名，并通过编号的
方式对这些数据进行统一的管理。
2 数组相关的概念
>数组名
>元素
>下标，索引
>数组的长度：元素的个数
3 数组的特点
1）数组是有序排列的
2）数组属于引用数据类型的变量，数组的元素既可以是基本数据类型，也可以是引用数据类型
3）创建的数组对象会在内存中开辟一整块连续的空间
4）数组的长度一旦确定，就不能修改
4,数组的分类
按照维数 一维数组 二维数组...
按照数组元素的类型 ，基本数据类型元素的数组，引用数据类型元素的数组
5 一维数组的使用
①一维数组的声明和初始化
②如何使用数组的指定位置的元素
③如何获取数组的长度
④如何遍历数组
⑤数组元素的默认初始化
⑥数组的内存解析
 */
public class ArrayTest {
    public static void main(String[] args) {
        int []ids;
        //1.1静态初始化
        ids=new int []{1001,1002,1003,1004};
        //1.2动态初始化
        String []names =new String[4];
        //2.通过索引的方式调用指定位置的元素，索引从0开始
        names[0]="张三";
        names[1]="李四";
        names[2]="王五";
        names[3]="陈六";
      //获取数组长度:length
        System.out.println(names.length);
        //遍历数组元素
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);

            }
        //默认初始化
        int []arr =new int[4];
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        short []arr1 =new short[4];
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        float []arr2 =new float[4];
        for(int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
        char []arr3 =new char[4];
        for(int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]);
        }
        boolean []arr4 =new boolean[4];
        for(int i=0;i< arr4.length;i++){
            System.out.println(arr4[i]);
        }

        String[]arr5 =new String[4];
        for(int i=0;i< arr5.length;i++){
            System.out.println(arr5[i]);
        }
        //二维数组
        //静态初始化
        int [][]darr =new int [][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化
        String [][]darr1 =new String[3][2];
        String[][]darr2 =new String[3][];
        //调用指定位置的元素

        System.out.println(darr[1][0]);
        //获取数组的长度
        System.out.println(darr.length);
        //遍历二维数组
        for (int i=0;i<darr.length;i++){
            for(int j=0;j<darr[i].length;j++){
                System.out.print(darr[i][j]+"  ");
            }
        }
        //初始化
        System.out.println(darr[0]);//地址值
        System.out.println(darr[0][0]);

    }
}
