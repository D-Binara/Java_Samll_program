import java.sql.SQLOutput;
import java.util.Scanner;
public class to_find_out_the_average_of_a_set_of_integers {

    public static void main(String[] args) {

        System.out.println("Enter your number count");

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        System.out.println("Enter your numbers");

        int[] arr = new int[10];

        for (int i = 0; n > i; i++) {
            arr[i] = num.nextInt();

        }
        for (int i = 0; n > i; i++) {
            System.out.println(arr[i]);

        }


    }
}
