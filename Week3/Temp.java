package Week3;

import java.util.Scanner;

public class Temp {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Give me a Fahrenheit temperature: ");
        
        double num = in.nextDouble();
        
        // Call the Helper.twoTimes() method to calculate the result
        double result = Convert.fahr2cels(num);

        
        // prepare the user for the result
        System.out.println("In Celsius that would be: " + result);
        in.close();
    }
}
