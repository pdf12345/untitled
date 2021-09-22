import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        // 1, boolean equals(int []a,int[]b);
        int []arr1=new int []{1,2,3,4};
        int []arr2=new int []{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
        //2, String  toString(int[]a)输出数组信息
        System.out.println(Arrays.toString(arr1));
        //3.void fill(int []a,int val):将指定值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4, void sort(int []a)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //5,int binarySearch(int[]a,int key)
        int []arr3=new int[] {-98,-34,2,34,54,66,79,105,210,333};
        int index =Arrays.binarySearch(arr3,210);
        if (index>=0){
            System.out.println(index);
        }
        else{
            System.out.println("没找到");
        }
//        int []arr5 =new int[]{1,2,3};
//        arr5=null;
//        System.out.println(arr5[0]);
//            int [][]arr4 =new int[4][];
//        System.out.println(arr4[0][0]);
    }
}
