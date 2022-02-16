package Week6;

// Task 1
// public class Main
// {
// 	public static void main(String []args)
// 	{
// 		Parent x = new Child();
// 	}
// }

// Task 2
// public class Main
// {
// 	public static void main(String []args)
// 	{
// 		Parent parent = new Child();
// 		System.out.println("parent.makeATwo() is " + parent.makeATwo());
// 	}
// }

// Task 4
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        String name = in.nextLine();
        
        Animal ani = new Animal(name);
        System.out.println(ani.greeting());
    }
}