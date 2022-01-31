package Week4;
import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");
        int i = 0;
        double sum = 0;
        while (i < num) {
            double numNext = in.nextDouble();
            sum += numNext;
            i += 1;
        }
        in.close();
        System.out.println("The average is " + sum / num);
    }
}
