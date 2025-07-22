package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(Double balance, String holder, Integer number, Double loanLimit) {
        super(balance, holder, number);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount;
        }
    }
}
