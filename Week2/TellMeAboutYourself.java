package Week2;

import java.util.Scanner;

public class TellMeAboutYourself
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();
        System.out.print(name + " what is your age and your favourite colour: ");
        String age = in.next();
        String colour = in.next();
        System.out.println("\nHello " + name + ", you are " + age + " and your favourite colour is " + colour);
        in.close();
    }
}
