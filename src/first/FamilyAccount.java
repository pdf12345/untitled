package first;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag =true;
        double basic = 10000;          //定义生活基本金，初始金额，用来记录每次收支变化后的金额
        String details = "收支 \t 账户金额 \t 收支金额 \t 说明\n";    //用于记录用户收入和支出的详情
        do{
            System.out.println("------------------家庭收支记账软件-----------------\n");
            System.out.println("                  1收支明细");
            System.out.println("                  2登记收入");
            System.out.println("                  3登记支出");
            System.out.println("                  4退   出\n");
            System.out.print("                  请选择(1-4): ");
            char selection=Utility.readMenuSelection();
            switch (selection){
                case '1':
                    //选择1 收支明细显示界面
                    System.out.println("-------------------当前收支明细记录-------------------");
                    System.out.println(details);      //显示用来记录用户收支详情的details变量
                    System.out.println("---------------------------------------------------\n");
                    break;
                case '2':
                    System.out.print("本次收入金额:");
                    double moneyIn = Utility.readNumber();   //调用自定义工具类Utility中读取金额收入与支出的函数
                    System.out.print("本次收入说明:");
                    String info_in = Utility.readString();   //调用自定义工具栏Utility中读取收入与支出说明的函数

                    //处理金额变化
                    basic += moneyIn;
                    //处理details,每记录一次收入，在details变量上叠加一次相关的字符串
                    details += "收入 \t " + basic + " \t " + moneyIn + " \t " + info_in + "\n";

                    //完成收入登记并点击回车后显示”登记完成“字样
                    System.out.println("----------------------登记完成-----------------------\n");

                    break;
                case '3':
                    System.out.print("本次支出金额:");
                    double moneyOut = Utility.readNumber();   //调用自定义工具类Utility中读取金额收入与支出的函数
                    System.out.print("本次支出说明:");
                    String info_Out = Utility.readString();   //调用自定义工具栏Utility中读取收入与支出说明的函数

                    //处理金额变化
                    basic -= moneyOut;
                    //处理details,每记录一次支出，在details变量上叠加一次相关字符串
                    details += "支出 \t " + basic + " \t " + moneyOut + " \t " + info_Out + "\n";

                    //完成支出登记并点击回车后显示”登记完成“字样
                    System.out.println("----------------------登记完成-----------------------\n");
                    break;
                case '4':
                    //System.out.println("退   出");
                    System.out.println("确认是否退出（Y/N）");
                   char isExit= Utility.readConfirmSelection();
                   if(isExit =='Y') {
                       isFlag = false;
                   }
            }
            //isFlag = false;

        }while(isFlag);

    }
}
