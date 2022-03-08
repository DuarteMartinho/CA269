package Week7;

public class Test {
    public static String firstShallBeLast(String s) {
        String out = "";
        out += s.substring(s.length() - 1);
        out += s.substring(1, s.length() - 1);
        out += s.substring(0, 1);
        return out;
    }

    public static int largest(int a, int b, int c) {
        int largest = a;
        if (b > largest && b > c) {
            largest = b;
        } else if (c > largest && c > b) {
            largest = c;
        }

        return largest;
    }
}
