import java.util.Scanner;

/*
分支结构2 switch -case
switch(表达式)
{
case 常量1：
执行语句1;
//break;
case 常量2:
执行语句2;
//break;
...
default:
执行语句n;
}
注意事项： 当不加break时候，进入case的满足条件，执行其语句，然后会继续往下执行直到结束，所以想执行一个跳出需要加break.break是可选的
switch 中的表达式只能是如下6种类型 ：byte,short,char,int,枚举类型,String类型
case 后只能声明常量，不能声明范围。
default相当于if-else中的else，是可选的，而且位置是灵活的。
switch-case 使用范围小于if-else。
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int number =2;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other");
        }
        String season ="summer";
      switch (season) {
          case "spring":
              System.out.println("春暖花开");
              break;
          case "summer":
              System.out.println("夏日炎炎");
              break;
          case "autumn":
              System.out.println("秋高气爽");
              break;
          case "winter":
              System.out.println("冬雪皑皑");
              break;
          default:
              System.out.println("季节输入有误");
      }
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入2021年的month： ");
        int month =scan.nextInt();
        System.out.println("请输入2021年的day： ");
        int day =scan.nextInt();
        int sumDays=0;
        switch (month){
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
                sumDays+=28;
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=day;
            break;
            default:
                System.out.println("输入的月份有误");

    }
        System.out.println("您输入的天数为2021年的第"+sumDays+"天");
    }
}
