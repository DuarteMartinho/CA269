package Week1;

import java.util.Scanner;

public class Cent2Fahr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int centigrade = in.nextInt();
        in.close();
        double fahr = ((1.8) * (centigrade)) + 32;  

        System.out.println(centigrade + " " +fahr);

    }
}