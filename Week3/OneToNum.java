package Week3;

import java.util.Scanner;

/**
 * OneToNum
 */
public class OneToNum {
    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int i = 1;
        while (i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Finish with a new line.
    }
}