package org.example;
import java.util.Scanner;
class Account{
    String accountholdersname;
    private final long accountnumber;
    private double balance;
    public Account(String name, long accnumber, long baalance){
        accountholdersname=name;
        accountnumber=accnumber;
        balance=baalance;
    }
    public void deposit(long deposit){
        System.out.println(accountholdersname);
        System.out.println(accountnumber);
        System.out.println("Before Depositing balance"+" "+balance);
        balance=balance+deposit;
        System.out.println("After Depositing Balance"+" "+balance);
    }
    public void withdrawal(long withdrwalamount){
        System.out.println(accountholdersname);
        System.out.println(accountnumber);
        System.out.println("Before Withdrawal balance"+" "+balance);
        balance=balance-withdrwalamount;
        System.out.println("After Withdrawal Balance"+" "+balance);
    }
    public void accbalance(){
        System.out.println(accountholdersname);
        System.out.println(accountnumber);
        System.out.println("Account Balance"+" "+balance);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Account Holders Name:");
        String name=sc.nextLine();
        System.out.print("Account Number:");
        long accnumber=sc.nextLong();
        System.out.print("Account Holder Balance:");
        long balance=sc.nextLong();
        Account acc=new Account(name,accnumber,balance);
        while(true){
            System.out.println("1.Deposit");
            System.out.println("2.withdrwal");
            System.out.println("3.Balance");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            int a=sc.nextInt();
            if(a==1){
                System.out.println("Enter the amount to be deposit");
                long deeposit=sc.nextLong();
                acc.deposit(deeposit);
            }
            else if(a==2){
                System.out.println("Enter the amount to be withdrawal");
                long withdrawalAmount=sc.nextLong();
                acc.withdrawal(withdrawalAmount);
            }
            else if(a==3){
                acc.accbalance();
            }
            else{
                System.out.println("Exit");
                break;
            }
        }

        sc.close();
    }
}
