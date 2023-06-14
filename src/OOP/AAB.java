package OOP;

public class AAB extends Bank {
    public int account_number;

    public static void main(String[] args) {
        Bank acc1 = new Bank();
        acc1.interestcal(10000F);
        System.out.println("Your interest is = "+acc1.interest);
    }
}
