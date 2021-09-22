package customerTest;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust =new Customer("Jane","Smith");
        cust.setAccount(new Account(1000,2000,0.0123));
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer[" +cust.getFirstName()+"."+cust.getLastName()+"]has" +
                " a account :id is"+cust.getAccount().getId()+",annualInterestRate is "+
                cust.getAccount().getAnnualInterestRate()*100+"%,balance is: "+cust.getAccount().getBalance());


    }
}
