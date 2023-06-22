package OOP;

public class Main {
    public static void main(String[] args) {
        Bank acc1 = new Bank(10);
        acc1.setBalance(1000);
        acc1.interestcal();
        System.out.println("Your interest is = "+acc1.getInterest());

        System.out.println(" ");

        Bank acc2 = new Bank(20);
        acc2.setBalance(200);
        acc2.interestcal();
        System.out.println("Your interest is = "+ acc2.getInterest());
    }
}