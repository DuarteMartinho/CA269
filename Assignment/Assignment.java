// Group Member Names - Student Numbers
// Dawid Lewinski - 20466172
// Duarte Martinho - 20410974
// Kevin Petrusevic - 20494554

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Welcome to our phone keypad!"); 

        Scanner in = new Scanner(System.in);

        while (true) {  // looping infinitely until loop is broken
            System.out.println("Choose what you want to do!");

            // list of possible options
            System.out.println("1 - List all letter combinations");
            System.out.println("2 - Digits to Words");
            System.out.println("3 - Credits");
            System.out.println("4 - Quit"); 
            System.out.print("Your desired option: ");

            // gets input from next line
            String input = in.next();

            // if statements to choose what option you want
            if (input.equals("1")) {
                getCombinations(); // call the method to get all possible combinations
            } else if (input.equals("2")) {
                getWord(); // calls method getWord to print a word mapped to user digits entered
            } else if (input.equals("3")) { // a list of group memeber names - their student number
                System.out.println("--Credits--");
                System.out.println("Group Members:");
                System.out.println("Duarte Martinho - 20410974");
                System.out.println("Dawid Lewinski - 20466172");
                System.out.println("Kevin Petrusevic - 20494554");
            } else if (input.equals("4")) { // exiting the infinte loop, quitting the program
                System.out.println("Goodbye. Have a nice day!");
                break;
            } else {    // if the option does not exist then please enter one that does
                System.out.println("Please only enter 1 or 2 or 3 or 4.");
            }
            System.out.println("");
        }
    }

    // building the recursive function
    public static int recursive(String output, String[] alphabet, int[] arrayofinput, int index) {
        if (index == arrayofinput.length) { // if the index is the same size of the length of the array arrayofinput
            System.out.print(output + " "); // print each output and separate with a space
            return 0;
        } else { 
            for (int i = 0; i < alphabet[arrayofinput[index]].length(); i++) {
                output += String.valueOf(alphabet[arrayofinput[index]].charAt(i));  // the letter from the map at the input position is added to the output
                recursive(output, alphabet, arrayofinput, index + 1);   // calling the recursive function and incrementing the index
                output = output.substring(0, output.length() - 1); // pops the last letter such that the new character can be added to output 
            }
        }
        return 0;
    }

    // building the getCombinations function
    public static void getCombinations() {

        Scanner in = new Scanner(System.in);

        // requesting the inputs
        System.out.print("Please enter your input to print all the possible combinations: ");

        String input = in.next();   // input is set as a string
        String[] alphabet = getAlphabet();  // getting the letters from the alphabet map and setting as a string variable

        int[] arrayofinput = new int[input.length()];   // making a new array of size input

        int i = 0;
        // for loop setting the string input as an integer
        for (char c : input.toCharArray()) { // for each character in input
            int pos = Character.getNumericValue(c); // converts it to an int
            arrayofinput[i] = pos;  // building an array named arrayofinput
            i++;
        }

        Boolean isInputValid = true;    // default to true

        for (int item : arrayofinput) { // for each item in array of input
            if (item == 0 || item == 1) {   // if the item is a 0 or a 1 then we set the isInputValid to false and break this for loop
                System.out.println("Please do not input 0 or 1");
                isInputValid = false;   // set the variable to false
                break;
            }
        }

        if (isInputValid) { // if the boolean is true
            String output = "";
            System.out.println("\nThe combinations are: ");
            recursive(output, alphabet, arrayofinput, 0);   // call the recursive function with the inputs...
            System.out.println();
        }
    }

    // building the getWord function
    public static void getWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("To use two letters from the same key please seperate with 0 or 1.\nPlease enter your digits to print a word: "); // waiting for user input
        String input = in.next();

        String[] alphabet = getAlphabet();  // calling the getAlphabet function which will be used to print mapped letters to digits

        int[] arrayofinput = new int[input.length()];   // making a new array of size length of input
        
        int i = 0;
        // for loop setting the string input as an integer
        for (char c : input.toCharArray()) { // for each character in input
            int pos = Character.getNumericValue(c); // converts it to an int
            arrayofinput[i] = pos;  // building an array named arrayofinput
            i++;
        }

        System.out.print("Your word is: ");

        if (arrayofinput[0] == 0 || arrayofinput[0] == 1) // if the first user input is 0 or 1 it is ignored
            System.out.print("");
        else if (arrayofinput.length == 1) {
            System.out.println(alphabet[arrayofinput[0]].charAt(0)); // if the the user inputs only 1 digit, this will print the letter mapped to the digit at position 0
        } else {
            for(int j = 0; j < arrayofinput.length; j++){   // this for loop gets the count for each digit a user inputs e.g 223322 would count 2 twice then 3 twice and then 2 twice again
                int count = 1;
                for (int k = j + 1; k < arrayofinput.length; k++) {
                    if (arrayofinput[j] != arrayofinput[k]) {
                        j = k - 1;
                        break;
                    } else {
                        if(alphabet[arrayofinput[j]].length() < count + 1)
                        {
                            j = k - 1;
                        }
                        else {
                            count++;
                            if(k == arrayofinput.length - 1){
                                j = k;
                            }
                            else{
                                j = k - 1;
                            }
                        }
                    }
                }
                if(arrayofinput[j] == 0 || arrayofinput[j] == 1){   // this if statement checks if user input is 0 or 1, it will print nothing but seperates the input
                    System.out.print("");
                }
                else{
                    System.out.print(alphabet[arrayofinput[j]].charAt(count - 1)); // otherwise it will print the letter mapped to the digit using the count of occurences of the digit e.g 22022 prints b and then b again
                }
            }  
        }
    }

    public static String[] getAlphabet() {  // mapping the number input to corresponding letters
        String nums[] = new String[10];
        nums[0] = "";
        nums[1] = "";
        nums[2] = "abc";
        nums[3] = "def";
        nums[4] = "ghi";
        nums[5] = "jkl";
        nums[6] = "mno";
        nums[7] = "pqrs";
        nums[8] = "tuv";
        nums[9] = "wxyz";

        return nums;
    }
}