package Week3;

import java.util.Scanner;

/**
 * NumToTwenty
 */
public class NumToTwenty {

    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int i = num;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Finish with a new line.
    }
}