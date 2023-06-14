package OOP;

public class Bank {
    int interestRate;
    float Balance=10;
    String AccountType;
    String BankRegNo;
    float interest;

    public void interestcal(Float interestRate){
        interest = Balance*(interestRate/100);
        System.out.println("Bank interest rate ="+interestRate);
    }

}
