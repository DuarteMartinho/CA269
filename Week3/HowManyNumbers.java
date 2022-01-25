package Week3;

import java.util.Scanner;

/**
 * HowManyNumbers
 */
public class HowManyNumbers {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (true) {
            int nextNum = in.nextInt();
            if (nextNum == -1) {
                System.out.println(i + " numbers were entered.");
                break;
            }
            i++;
        }
        in.close();
    }
}