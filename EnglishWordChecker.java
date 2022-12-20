import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnglishWordChecker {
    public static boolean check_for_word(String word) {
        // System.out.println(word);
        try {
            // BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/american-english")); // For Linux
            BufferedReader in = new BufferedReader(new FileReader("/usr/share/dict/web2")); // For Mac
            String str;
            while ((str = in.readLine()) != null) {
                if (str.indexOf(word) != -1) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
          System.out.println("Caught an exception " + e);
        }

        return false;
    }

    public static void main(String[] args) {
                // initialize scanner to read from standard input
                Scanner scanner = new Scanner(System.in);

                System.out.println("Please provide a string to check if it is a valid word ");
                String inputWord = scanner.next();

        System.out.println("Given word " + inputWord + " is it a word? " + check_for_word(inputWord));

                scanner.close();
    }
}
