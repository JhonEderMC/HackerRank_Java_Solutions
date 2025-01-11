package introduction.Pattern_Syntax_Checker_20;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTest = scanner.nextInt();
        scanner.nextLine();// // Consume the newline character

        for (int i = 0; i <numberOfTest; i++) {
            String regex = scanner.nextLine(); // Input the regex pattern
           System.out.println(isValidPattern(regex) ? "Valid" : "Invalid");
        }
        scanner.close();
    }

    private static boolean isValidPattern(String regex) {
        try {
            Pattern.compile(regex);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
