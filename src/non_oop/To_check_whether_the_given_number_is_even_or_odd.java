package non_oop;

import java.util.Scanner;


public class To_check_whether_the_given_number_is_even_or_odd {

    public static void main(String args[]) {

        System.out.println("Enter your number");

        Scanner Odd = new Scanner(System.in);
        int num = Odd.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is Even number");
        } else {
            System.out.println("This is odd number");
        }

    }
}