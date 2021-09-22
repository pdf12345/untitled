package customerTest;
public class BankTest {
    public static void main(String[] args) {

        Bank bank =new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getCustomers(0).setAccount(new Account(1,2000,0.01));
    }
}