package Week7;

import java.util.Scanner;

public class FindMatchingLetters {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two lines:");
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        in.close();

        int match = 0;
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(i)) {
                    match++;
                    break;
                }
            }
        }

        System.out.println("There are " + match + " corresponding characters.");
    }
}
