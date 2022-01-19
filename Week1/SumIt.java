package Week1;
import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");
        
        // Read in the numbers (you need a nextInt for each integer)
        // :PUT YOUR CODE HERE:
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        in.close();
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:
        int result = number1 + number2;
        
        // prepare the user for the result
        // print out the result (use System.out.println() )
        // :PUT YOUR CODE HERE:
        System.out.println(number1 + " and " + number2 + " is " + result);
        
    }
}