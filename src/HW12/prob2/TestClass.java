package HW12.prob2;

public class TestClass {
    static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("John","101",200);
//        account.deposit(-100);
//        account.withdraw(-100);
        account.deposit(500);
//        account.withdraw(650);
//        account.withdraw(1000);
        account.withdraw(600);
        System.out.println(account.getBalance());
    }
}
