package OOP;

public class Bank {
    private final float interestRate;
    private float balance = 125;
    private String AccountType;
    private String BankRegNo;
    private float interest;

    private int account_number;

    public Bank(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void interestcal(){
        this.interest = this.balance*(interestRate/100);;
        System.out.println("Bank balance ="+balance);
        System.out.println("Bank interest rate ="+interestRate);
    }



}
