package Week4;

public class Test {
    public static int getSum(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
        return sum;
    }

    public static int countFives(int[] array) {
        int count = 0;
        for (int val : array) {
            if (val == 5) {
                count += 1;
            }
        }
        return count;
    }
    
    public static int countEven(int[] array) {
        int count = 0;
        for (int val : array) {
            if (val % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
