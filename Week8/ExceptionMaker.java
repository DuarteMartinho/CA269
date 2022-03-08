package Week8;

public class ExceptionMaker {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < args.length + 100; i++) {
            total += Integer.parseInt(args[i]);
        }
        System.out.println(total);
    }
}
