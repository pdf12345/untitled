package first;

import java.util.Locale;
import java.util.Scanner;

public class Utility {
    private  static Scanner scanner=new Scanner(System.in);

    public static  char readMenuSelection(){
        char c;
        for(; ;){
            String str =readKeyBoard(1);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.println("选择错误，请重新输入：");
            }else break;
        }
        return c;
    }
public  static  int readNumber(){
        int n;
        for(;;){
            String str =readKeyBoard(4);
            try{
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
}
public  static  String readString(){
        String str =readKeyBoard(8);
        return str;
}
    public static char readConfirmSelection() {
        char c;
        for(; ;) {
            String str = readKeyBoard(1).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N'){
                break;

            }else{
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }
    private static String readKeyBoard(int limit) {
        String line = "";
        while (scanner.hasNext()) {
        /*
        Scanner类中的hasNext方法读取的是boolean型的值，用于检测输入是否还有其他单词，有则真无则假
        官方解释：当执行到hasNext（）时，它会先扫描缓冲区中是否有字符，有则返回true,继续扫描。
                直到扫描为空，这时并不返回false,而是将方法阻塞，等待你输入内容然后继续扫描。
        */
            line = scanner.nextLine();       //将从键盘上读取到的内容赋给line,为字符串类型
            if (line.length() < 1 || line.length() > limit) {     //当输入字符串长度小于1或输入字符串长度超过参数限制时执行
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;       //再次执行循环来读取键盘输入的有意义的值
            }
            break;     //当读取到的字符串符合要求则终止循环，执行循环外的下一条语句返回字符串
        }
        return line;
    }



}
