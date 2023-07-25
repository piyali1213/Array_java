package piyali;
import java.util.Scanner;

 public class BankAccountTest {
    String name;
    int account;
    double amount;
     static  String bank_name = "ICICI";
    void insert(String n,int a, double am)
    {   name= n;
        account= a;
        amount = am;


    }
    void display()
    {
        System.out.println(name+ " " +account+ " "+amount +" " +bank_name);
    }
    void deposite()

    {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the amount  ." );
         int amt = input.nextInt();
        amount= amount+amt;
        System.out.println(amt+ "deposited");
    }
    void withdrawl() {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the amount for withdrawl ." );
        int amt = input.nextInt();
        if (amount < amt) {
            System.out.println("insuficient balance");
        } else {
            amount= amount-amt;
            System.out.println(amt + "withdrawl");
        }
    }
    void checkBalance() {
        System.out.println("current balance " + amount);
    }


        }






