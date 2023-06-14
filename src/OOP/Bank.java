package OOP;

public class Bank {
    int interestRate;
    float Balance=10;
    String AccountType;
    String BankRegNo;
    float interest;

    public void interestcal(Float interestrate){
         interestrate = Balance*(interestRate/100);
        System.out.println(interestrate);
    }

}
