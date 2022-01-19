package Week2;

import java.util.Scanner;

public class NextYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        System.out.print("What age are you: ");
        String age = in.next();
        System.out.println("Hello " + name + ", next year you will be " + (Integer.parseInt(age) + 1));
        in.close();
    }
}
