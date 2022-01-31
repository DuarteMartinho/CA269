package Week4;
import java.util.Scanner;

public class Reverse {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        System.out.print("Enter " + num + " numbers: ");

        int[] reversed = new int[num];
        int i = 0;
        while (i < num) {
            int numNext = in.nextInt();
            reversed[num - i - 1] = numNext;
            i += 1;
        }
        // print them out
        System.out.print("The numbers reversed are:");
        // Use System.out.print(" " + num[i]); and finish with a newline.
        for (int val : reversed) {
            System.out.print(" " + val);
        }

        System.out.println();
        in.close();
    }
}