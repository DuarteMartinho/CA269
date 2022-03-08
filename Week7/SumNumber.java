package Week7;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }

        System.out.println("The sum of the numbers from 1 to " + num + " is " + total + "");
    }
}
