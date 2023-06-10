package OOP;

public class AAB extends Bank {
    public int account_number;

    public static void main(String[] args) {
        Bank acc1 = new Bank();
        acc1.AccountType = "Savings account";
        acc1.interest=18;
        acc1.Balance=10000;
        acc1.interestcal();
        System.out.println("Your interest is = "+acc1.interest);
    }
}
