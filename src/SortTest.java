
public class SortTest {
    public static void main(String[] args) {
        //冒泡排序
        int []arr ={49,38,65,97,76,13,27,49};
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                 if (arr[j]>arr[j+1]){
                     int temp =arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
            }
        }
        for (int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }


        }
    }

