package OOP;

public class Bank {
    int interestRate;
    float Balance;
    String AccountType;
    String BankRegNo;
    float interest;

    public void interestcal(){
         interest = Balance*interestRate;
    }

}
