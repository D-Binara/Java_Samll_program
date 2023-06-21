package OOP;

public class Main {
    public static void main(String[] args) {
        Bank acc1 = new Bank(10);
        acc1.interestcal();
        System.out.println("Your interest is = "+acc1.getInterest());

        Bank bank2 = new Bank(20);
        /*AAB acc = new AAB();
        acc.setBalance(200);
        acc.interestcal(10);
        System.out.println("Your interest is = "+ acc.getInterest());*/
    }
}