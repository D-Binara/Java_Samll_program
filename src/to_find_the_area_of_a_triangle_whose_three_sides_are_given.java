import java.util.Scanner;
import java.math.*;

public class to_find_the_area_of_a_triangle_whose_three_sides_are_given {

        public static void main(String args[]){

            System.out.println("Enter your first values");
            Scanner x = new Scanner(System.in);
            int a = x.nextInt();

            System.out.println("Enter your second values");
            Scanner Y = new Scanner(System.in);
            int b = x.nextInt();

            System.out.println("Enter your third values");
            Scanner Z = new Scanner(System.in);
            int c =x.nextInt();

            System.out.println(a+b+c);

            double area;
            if((a+b)>c && (a+c)>b && (b+c)>a) {

                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Area of triangular=" + area);
            }
            else
            {
                System.out.println("This is not triangular");
            }


        }
    }

