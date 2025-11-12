package entities;

public class h_BankAccount {

    private String holder;
    private double balance;
    private int accNumber;

    public h_BankAccount(String holder, double initialDeposit, int accNumber) {
        this.holder = holder;
        deposit(initialDeposit);
        this.accNumber = accNumber;
    }

    public h_BankAccount(String holder, int accNumber) {
        this.holder = holder;
        this.accNumber = accNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        balance = balance - amount - 5;
    }

    public String toString(){

        return "Account "
                + accNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }

}