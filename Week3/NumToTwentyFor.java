package Week3;

import java.util.Scanner;

/**
 * NumToTwenty
 */
public class NumToTwentyFor {

    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        for (int i = num; i <= 20; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // Finish with a new line.
    }
}