package Week1;

import java.util.Scanner;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read in the number (use in.nextInt() and assign it to an integer
        // :PUT YOUR CODE HERE:
        int number = in.nextInt();
        in.close();
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:
        int result = number * number;
        // prepare the user for the result
        // print out the result (use System.out.println()
        // :PUT YOUR CODE HERE:
        System.out.println(number + " squared is " + result);
        
    }
}