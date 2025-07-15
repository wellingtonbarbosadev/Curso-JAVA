package entities;

public class Holders {
    private int account_number;
    private String account_holder;
    private double initial_deposit_value;
    private double balance;

    public Holders(int account_number, String account_holder) {
        this.account_number = account_number;
        this.account_holder = account_holder;
    }

    public Holders(int account_number, String account_holder, double initial_deposit_value) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.initial_deposit_value = initial_deposit_value;
        balance += initial_deposit_value;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void returnUpdateData() {
        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $%.2f", account_number, account_holder, getBalance());
        System.out.println();
        System.out.println();
    }


    public double getBalance() {
        return balance;
    }
    
    public void setDeposit(double value_deposit) {
        balance += value_deposit;
        returnUpdateData();
    }

    public void setWithdraw(double value_withdraw) {
        balance -= value_withdraw;
        balance -= 5;
        returnUpdateData();
    }


    public String toString() {
        return "Account "
                + account_number
                + ", Holder: "
                + account_holder
                + ", Balance: $"
                + String.format("%.2f", getBalance());
    }

}
