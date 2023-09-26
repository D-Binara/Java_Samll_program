package Patterns;

public class Ascending_Number_Pattern {
    public static void main(String[] args) {
        int rows = 5;
        int k = rows;
        int a = rows;
        int b = rows + 1;
        int loopCount = 1;


        // Outer loop to iterate through rows
        for (int i = 0; rows >= i; ++i) {

            // Inner loop to print numbers in each row
            for (int j = 1; j <= a; j++) {
                System.out.print(k);
                k++;
            }
            k = k - b;
            a = rows - loopCount;
            b = b - 1;
            loopCount++;
            // Print a space after each row
            System.out.println();
        }
    }

}
