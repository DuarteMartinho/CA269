package Week2;

import java.util.Scanner;

public class FirstThree {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Your nickname is " + name.substring(0, 3) + ".");
        in.close();
    }

}
