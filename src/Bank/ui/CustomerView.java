package Bank.ui;
import Bank.bean.Customer;
import Bank.service.CustomerList;
import Bank.util.CMUtility;

public class CustomerView {
    private CustomerList customerList =new CustomerList(10);
    public CustomerView(){
//        Customer customer =new Customer("潘栋", '男',25,"15988167543","1285224364@qq.com");
//        customerList.addCustomer(customer);
    }
    public void enterMainMenu(){
        boolean isFlag =true;
        do {
            System.out.println("------------------客户信息管理软件-----------------\n");
            System.out.println("                  1添加客户");
            System.out.println("                  2修改客户");
            System.out.println("                  3删除客户");
            System.out.println("                  4客户列表");
            System.out.println("                  5退   出\n");
            System.out.print("                  请选择(1-5): ");
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case'4':
                    listAllCustomers();
                    break;
                case'5':
                    System.out.print("确认是否退出(Y/N)");
                    char isExit =CMUtility.readConfirmSelection();
                    if(isExit=='Y'){
                        isFlag=false;
                    }

            }
        }while(isFlag);
    }
    private void deleteCustomer() {
        System.out.println("--------------------删除客户---------");
        System.out.println("请选择删除客户的编号");
        int number;
        for (; ; ) {
            System.out.println("");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定的客户");
            }else {
                break;
            }
        }
            System.out.println("确认是否删除（Y/N):");
            char isDelete =CMUtility.readConfirmSelection();
            if(isDelete=='Y'){
               if(customerList.deleteCustomer(number-1)){
                   System.out.println("--------------删除完成--------------");
               }
               else{
                   System.out.println("-------------------删除失败-----------");
               }
            }
            else{
                return;
            }

        }

    private void listAllCustomers() {
        System.out.println("-------------------客户列表-----------------------");
        if(customerList.getTotal()==0)
        {
            System.out.println("没有客户记录！");
        }
        else{
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[]custs =customerList.getAllCustomers();
            for(int i=0;i<custs.length;i++){
                Customer cust=custs[i];
                System.out.println((i+1)+"\t"+cust.getName()+"\t"+cust.getGender()
                        +"\t"+cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getEmail());
            }
        }
        System.out.println();
    }

    private void modifyCustomer() {
        System.out.println("-----------------修改客户-----------------");
        System.out.println("请输入客户编号");
        Customer cust;
        int number;
        for(;;){
        System.out.println("");
        number=CMUtility.readInt();
        if(number==-1){
            return;
        }
        cust=customerList.getCustomer(number-1);
        if(cust==null){
            System.out.println("无法找到指定客户");

        }else{
            break;
        }
        }
        //修改客户信息
        System.out.println("姓名("+cust.getName()+")");
        String name=CMUtility.readString(10,cust.getName());
        System.out.println("性别("+cust.getGender()+")");
        char gender=CMUtility.readChar(cust.getGender());
        System.out.println("年龄("+cust.getAge()+")");
        int age=CMUtility.readInt(cust.getAge());
        System.out.println("电话("+cust.getPhone()+")");
        String phone=CMUtility.readString(10,cust.getPhone());
        System.out.println("邮箱("+cust.getEmail()+")");
        String email=CMUtility.readString(10,cust.getEmail());
        Customer c =new Customer(name, gender,  age, phone,  email);
       if( customerList.replaceCustomer(number-1,c)){
           System.out.println("-------------修改成功---------------------");
       }
    }

    private void addNewCustomer() {
        //编号	姓名	性别	年龄		电话		邮箱
        System.out.println("-------------------添加客户--------------");
        System.out.println("姓名：");
        String name=CMUtility.readString(10);
        System.out.println("性别：");
        char gender =CMUtility.readChar();
        System.out.println("年龄：");
        int age =CMUtility.readInt();
        System.out.println("电话：");
        String number =CMUtility.readString(11);
        System.out.println("邮箱：");
        String email =CMUtility.readString(20);
        Customer customer =new Customer(name, gender,age,number,email);
        boolean isSuccess=customerList.addCustomer(customer);
        if(isSuccess){
            System.out.println("--------------------添加成功-----------------");
        }else{
            System.out.println("-------------------添加失败------------------");
        }

    }

    public static void main(String[] args) {
        CustomerView customerView =new CustomerView();
        customerView.enterMainMenu();
    }
}
