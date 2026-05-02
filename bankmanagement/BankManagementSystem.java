package bankmanagement;
import java.util.*;
public class BankManagementSystem {
    private static Map<String,Account> accounts = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Welcome to the Bank Management System");
        while(true){
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            int ch = sc.nextInt();
            sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the Account Number: ");
                    String accNum = sc.next();
                    System.out.println("Enter the Account Holder Name: ");
                    String accHolderName = sc.next();
                    if(!accounts.containsKey(accNum)){
                        accounts.put(accNum,new Account(accNum,accHolderName));
                        System.out.println("Account Created Successfully!!!");

                    }
                    break;
                case 2:
                    System.out.println("Enter the Account Number: ");
                    String Num = sc.next();;
                    System.out.println("Enter the Amount to Deposit: ");
                    double amount = sc.nextDouble();
                    accounts.get(Num).Deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter the Account Number");
                    String n = sc.next();
                    if(accounts.containsKey(n)){
                        System.out.println("Enter the Amount to Withdraw: ");
                        double a = sc.nextDouble();
                        accounts.get(n).withdraw(a);
                    }
                    break;
                case 4:
                    System.out.println("Enter the Account Number: ");
                    String number = sc.next();
                    if(accounts.containsKey(number)){
                        Account acc = accounts.get(number);
                        System.out.println("Account Number: "+acc.getAccountNumber());
                        System.out.println("Account Holder Name: "+acc.getAccountHolderName());
                        System.out.println("Balance: "+acc.getBalance());
                    }
                    else{
                        System.out.println("Account Not Found!!!");
                    }
                case 5:
                    System.out.println("Exiting.....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }
}
