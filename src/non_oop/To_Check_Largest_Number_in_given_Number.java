package non_oop;

import java.util.Scanner;
public class To_Check_Largest_Number_in_given_Number {

    public static void main(String[] args) {

        float x = 0,y=0,z = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter your Number " + i);
            Scanner inp = new Scanner(System.in);
            if (i == 1) {
                x = inp.nextFloat();
            }
            else if (i == 2) {
                y = inp.nextFloat();
            }
            else  {
                z = inp.nextFloat();
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        if (x>y) {
            if (x > z) {
                System.out.println("Largest Number is " + x);
            } else {
                System.out.println("Largest Number is " + z);
            }
        }
        else {
             if (y>z){
                 System.out.println("Largest Number is " + y);
            }
             else
                 System.out.println("Largest Number is " + z);
        }

    }
}
