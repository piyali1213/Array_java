package piyali;

public class BankAccountMain {


    public static void main(String[] args) {
        BankAccountTest a1 = new BankAccountTest();
        a1.insert("piyali", 101 , 5000);
        a1.deposite();
        a1.checkBalance();
        a1.withdrawl();
        a1.checkBalance();
        a1.display();
    }
}
