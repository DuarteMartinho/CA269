package Week2;

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.next();
        System.out.println("The last letter of your name is " + name.substring(name.length() - 1, name.length()) + ".");
        in.close();
    }
}
