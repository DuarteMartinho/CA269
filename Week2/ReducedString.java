package Week2;

import java.util.Scanner;

public class ReducedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int position = in.nextInt();
        String word = in.next();
        String output = word.substring(0, position) + word.substring(position);
        System.out.println(output);
        in.close();
    }
}
