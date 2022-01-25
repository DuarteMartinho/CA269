package Week3;

import java.util.Scanner;

/**
 * NoMinusOne
 */
public class NoMinusOne {

    public static void main(String[] args) {
        System.out.println("Enter a numbers: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (true) {
            int nextNum = in.nextInt();
            if (nextNum == -1) {
                System.out.println("The penultimate number was: " + num);
                break;
            }
            num = nextNum;
        }
        in.close();
    }
}