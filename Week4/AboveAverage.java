package Week4;
//
// Supplied code to help ensure there will be no output formatting issues.
//
import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        
        System.out.print("Enter " + num + " numbers: ");

        double[] numbers = new double[num];
        int i = 0;
        double sum = 0;
        while (i < num) {
            double numNext = in.nextDouble();
            numbers[i] = numNext;
            sum += numNext;
            i += 1;
        }
        in.close();
        double avg = sum / num;

        System.out.println("The above average numbers are:");
        for (double val : numbers) {
            if (val > avg) {
                System.out.print(" " + val);
            }
        }
        System.out.println(); 
    }
}