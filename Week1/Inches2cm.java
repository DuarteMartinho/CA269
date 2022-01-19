package Week1;

import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a quantity in inches: ");
        double inchincm = 2.54;
        int reqInches = in.nextInt();
        in.close();
        double cm = reqInches * inchincm;
        // Print out the result
        System.out.println(reqInches + " inch is " + cm + " cm");
    }
}