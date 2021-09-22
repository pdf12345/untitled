package customerTest;

public class Bank {
    private  Customer[]customers;//存放多个客户的数组
    private int numberOfCustomers;//记录客户的个数
    public Bank(){
           customers=new Customer[10];
    }
    //添加客户
    public void addCustomer(String f,String l){
     Customer customer =new Customer(f,l);
     customers[numberOfCustomers++]=customer;
    }

    public Customer getCustomers(int index) {
        if(index>=0&&index<numberOfCustomers) {
            return customers[index];
        }
        else{
            return null;
        }
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}
