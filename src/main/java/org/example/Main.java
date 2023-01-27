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
        long ca=accountnumber;
        String la=""+ca;
        l.info(la);
        String lb="Before Depositing balance:"+balance;
        l.info(lb);
        balance=balance+deposit;
        String lc="After Depositing Balance:"+balance;
        l.info(lc);
    }
    public void withdrawal(long withdrwalamount){
        Logger l= Logger.getLogger("com.api.jar");
        l.info(accountholdersname);
        long cv=accountnumber;
        String ld=""+cv;
        l.info(ld);
        String le="Before Withdrawal balance:"+balance;
        l.info(le);
        balance=balance-withdrwalamount;
        String lf="After Withdrawal Balance:"+balance;
        l.info(lf);
    }
    public void accbalance(){
        Logger l= Logger.getLogger("com.api.jar");
        l.info(accountholdersname);
        long cc=accountnumber;
        String lg=""+cc;
        l.info(lg);
        String lh="Account Balance"+balance;
        l.info(lh);
    }


    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        l.info("Account Holders Name:");
        String name=sc.nextLine();
        l.info("Account Number:");
        long accnumber=sc.nextLong();
        l.info("Account Holder Balance:");
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
