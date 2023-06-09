package non_oop;

import java.util.Scanner;

public class convert_the_temperature_in_Centigrade_to_Fahrenheit {

        public static void main(String args[]){
            System.out.println("Enter Your Value in Centigrade");
            Scanner x = new Scanner(System.in);
            int Cel = x.nextInt();

            float Fah = Cel*9/5+32;

            System.out.println("Answer is :- "+Fah);
        }

}
