package org.example;
//package JavaProject;
import java.util.Scanner;
class Simple_Bank_Account{
    String account_holders_name;
    private final long account_number;
    private double balance;
    public Simple_Bank_Account(String name, long acc_number, long Balance){
        account_holders_name=name;
        account_number=acc_number;
        balance=Balance;
    }
    public void deposit(long Deposit){
        System.out.println("------------------------");
        System.out.println("Name :"+account_holders_name);
        System.out.println("Account_Number :"+account_number);
        System.out.println("Before Depositing balance"+" "+balance);
        balance=balance+Deposit;
        System.out.println("After Depositing Balance"+" "+balance);
        System.out.println("-------------------------------");
    }
    public void Withdrawal(long Withdrwal_Amount){
        System.out.println("------------------------");
        System.out.println("Name :"+account_holders_name);
        System.out.println("Account_Number :"+account_number);
        System.out.println("Before Withdrawal balance"+" "+balance);
        balance=balance-Withdrwal_Amount;
        System.out.println("After Withdrawal Balance"+" "+balance);
        System.out.println("------------------------");
    }
    public void Acc_balance(){
        System.out.println("------------------------");
        System.out.println("Name :"+account_holders_name);
        System.out.println("Account_Number :"+account_number);
        System.out.println("Account Balance"+" "+ balance);
        System.out.println("------------------------");
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Account Holders Name:");
        String name=sc.nextLine();
        System.out.print("Account Number:");
        long acc_number=sc.nextLong();
        System.out.print("Account Holder Balance:");
        long Balance=sc.nextLong();
        Simple_Bank_Account acc=new Simple_Bank_Account(name,acc_number,Balance);
        while(true){
            System.out.println("1.Deposit");
            System.out.println("2.withdrwal");
            System.out.println("3.Balance");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            int A=sc.nextInt();
            if(A==1){
                System.out.println("Enter the amount to be deposit");
                long Deposit=sc.nextLong();
                acc.deposit(Deposit);
            }
            else if(A==2){
                System.out.println("Enter the amount to be withdrawal");
                long Withdrawal_Amount=sc.nextLong();
                acc.Withdrawal(Withdrawal_Amount);
            }
            else if(A==3){
                acc.Acc_balance();
            }
            else{
                System.out.println("Exit");
                break;
            }
        }

        sc.close();
    }
}
