import java.util.*;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of "+amount+" is successful. Current bank balance is "+balance);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw of "+amount+" is successful. Current bank balance is "+balance);
        }else{
            System.out.println("Invalid withdrawl amount or Insufficient bank balance.");
        }
    }
}
class ATM{
    private BankAccount  bankAccount;
    public ATM(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void display(){
        System.out.println("ATM Menu: ");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void performTransaction(int choice,Scanner sc){
        switch(choice){
            case 1:
            System.out.println("Current Bank Balance : "+bankAccount.getBalance());
            break;
            case 2:
            System.out.println("Enter deposit amount : ");
            double depositAmount=sc.nextDouble();
            bankAccount.deposit(depositAmount);
            break;
            case 3:
            System.out.println("Enter withdrawal amount :");
            double withdrawAmount=sc.nextDouble();
            bankAccount.withdraw(withdrawAmount);
            break;
            case 4:
            System.out.println("Exiting ATM. Thank You!!!");
            sc.close();
            System.exit(0);
            default:
            System.out.println("Invalid choice. Please choose from the given option.");
        }
    }
}
public class AtmInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter initial bank account balance :");
        double initialBalance=sc.nextDouble();
        BankAccount bankAccount=new BankAccount(initialBalance);
        ATM atm=new ATM(bankAccount);
        while(true){
            atm.display();
            System.out.println("Select an option : ");
            int choice=sc.nextInt();
            atm.performTransaction(choice,sc);
        }
    }
}
