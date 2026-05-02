package bankmanagement;

public class Account {
    private String AccountNumber;
    private String AccountHolderName;
    private double Balance;
    public Account(String accountNumber, String accountHolderName) {
        this.AccountNumber = accountNumber;
        this.AccountHolderName = accountHolderName;
        this.Balance = 0.0;
    }
    String getAccountNumber() {
        return AccountNumber;
    }
    String getAccountHolderName() {
        return AccountHolderName;
    }
    double getBalance() {
        return Balance;
    }
    void Deposit(double amount){
        if(amount<0){
            System.out.println("Invalid Amount!!!");
        }
        else{
            Balance+=amount;
            System.out.println("Amount Deposited: "+amount);
        }
    }
    void withdraw(double amount){
        if(amount<0){
            System.out.println("Invalid Amount!!!");
        }
        else if(amount>Balance){
            System.out.println("Insufficient Balance!!!");
        }
        else{
            Balance-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
    }
}
