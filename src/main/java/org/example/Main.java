package org.example;
import java.util.Scanner;
class simplebankaccount{
    String accountholdersname;
    private final long accountnumber;
    private double balance;
    public simplebankaccount(String name, long accnumber, long baalance){
        accountholdersname=name;
        accountnumber=accnumber;
        balance=baalance;
    }
    public void deposit(long deposit){
        logger.log.println(accountholdersname);
        logger.log.println(accountnumber);
        logger.log.println("Before Depositing balance"+" "+balance);
        balance=balance+deposit;
        logger.log.println("After Depositing Balance"+" "+balance);
    }
    public void withdrawal(long withdrwalamount){
        logger.log.println(accountholdersname);
        logger.log.println(accountnumber);
        logger.log.println("Before Withdrawal balance"+" "+balance);
        balance=balance-withdrwalamount;
        logger.log.println("After Withdrawal Balance"+" "+balance);
    }
    public void accbalance(){
        logger.log.println(accountholdersname);
        logger.log.println(accountnumber);
        logger.log.println("Account Balance"+" "+ balance);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        logger.log.print("Account Holders Name:");
        String name=sc.nextLine();
        logger.log.print("Account Number:");
        long accnumber=sc.nextLong();
        logger.log.print("Account Holder Balance:");
        long balance=sc.nextLong();
        simplebankaccount acc=new simplebankaccount(name,accnumber,balance);
        while(true){
            logger.log.println("1.Deposit");
            logger.log.println("2.withdrwal");
            logger.log.println("3.Balance");
            logger.log.println("4.Exit");
            logger.log.println("Enter Your Choice");
            int a=sc.nextInt();
            if(a==1){
                logger.log.println("Enter the amount to be deposit");
                long deeposit=sc.nextLong();
                acc.deposit(deeposit);
            }
            else if(a==2){
                logger.log.println("Enter the amount to be withdrawal");
                long withdrawalAmount=sc.nextLong();
                acc.withdrawal(withdrawalAmount);
            }
            else if(a==3){
                acc.accbalance();
            }
            else{
                logger.log.println("Exit");
                break;
            }
        }

        sc.close();
    }
}
