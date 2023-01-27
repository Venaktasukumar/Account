package org.example;
import java.util.Scanner;
import java.util.logging.*;
class Account{
    String accountholdersname;
    private final long accountnumber;
    private double balance;
    public Account(String name, long accnumber, long baalance){
        Logger l= Logger.getLogger("com.api.jar");
        accountholdersname=name;
        accountnumber=accnumber;
        balance=baalance;
    }
    public void deposit(long deposit){
        Logger l= Logger.getLogger("com.api.jar");
        l.info(accountholdersname);
        l.info(String.valueOf(accountnumber));
        l.info("Before Depositing balance"+" "+balance);
        balance=balance+deposit;
        l.info("After Depositing Balance"+" "+balance);
    }
    public void withdrawal(long withdrwalamount){
        Logger l= Logger.getLogger("com.api.jar");
        l.info(accountholdersname);
        l.info(String.valueOf(accountnumber));
        l.info("Before Withdrawal balance"+" "+balance);
        balance=balance-withdrwalamount;
        l.info("After Withdrawal Balance"+" "+balance);
    }
    public void accbalance(){
        Logger l= Logger.getLogger("com.api.jar");
        l.info(accountholdersname);
        l.info(String.valueOf(accountnumber));
        l.info("Account Balance"+" "+balance);
    }


    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        System.out.print("Account Holders Name:");
        String name=sc.nextLine();
        System.out.print("Account Number:");
        long accnumber=sc.nextLong();
        System.out.print("Account Holder Balance:");
        long balance=sc.nextLong();
        Account acc=new Account(name,accnumber,balance);
        while(true){
            l.info("1.Deposit");
            l.info("2.withdrwal");
            l.info("3.Balance");
            l.info("4.Exit");
            l.info("Enter Your Choice");
            int a=sc.nextInt();
            if(a==1){
                l.info("Enter the amount to be deposit");
                long deeposit=sc.nextLong();
                acc.deposit(deeposit);
            }
            else if(a==2){
                l.info("Enter the amount to be withdrawal");
                long withdrawalAmount=sc.nextLong();
                acc.withdrawal(withdrawalAmount);
            }
            else if(a==3){
                acc.accbalance();
            }
            else{
                l.info("Exit");
                break;
            }
        }

        sc.close();
    }
}
