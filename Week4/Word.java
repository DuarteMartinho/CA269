package Week4;

public class Word {
    public static Boolean isFirstLetter(String word, char c) {
        return word.charAt(0) == c;
    }

    public static Boolean containsLetter(String word, char c) {
        for(int i=0; i< word.length(); i++) 
        {
            if(word.charAt(i) == c) {
                return true;
            } 
        }
        return false;
    }

    public static Boolean allDone(String word, String guessed) {
        for(int i=0; i< word.length(); i++) 
        {
            if(guessed.indexOf(word.charAt(i)) == -1) {
                return false;
            } 
        }
        return true;
    }
    
    public static String showLetter(String word, char guess) {
        String res = "";
        for(int i=0; i< word.length(); i++) 
        {
            if(word.charAt(i) == guess) {
                res += guess;
            } else {
                res += "_";
            }
        }
        return res;
    }

    public static String showLetters(String word, String guesses) {
        String res = "";
        for (int k=0; k<word.length(); k++) res += '_';
        for (int i=0; i < guesses.length(); i++) {
            for (int j=0; j < word.length(); j++) {
                if ((res.charAt(j) == '_') && (word.charAt(j) == guesses.charAt(i))) {
                    String left = res.substring(0, j);
                    String right = res.substring(j + 1);
                    res = left + guesses.charAt(i) + right;
                }   
            }
        }
        return res;
    }
}
