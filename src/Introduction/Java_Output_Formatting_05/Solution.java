package Introduction.Java_Output_Formatting_05;

import java.util.*;

/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0  to 999 .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than th
*/

public class Solution {

    public static String SEPARATOR ="================================";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printSeparator();
        for (int i = 0; i <3; i++) {
            if(i>0) {
                scanner.nextLine();
            }
            String string = scanner.next();
            int  number = scanner.nextInt();
            //scanner.next();
            //scanner.nextLine();

            stringFormat(string, number);
        }
        scanner.close();
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println(SEPARATOR);
    }

    public static void stringFormat(String string,int number){
        String numberString = String.format("%03d", number);
        String space = String.format("%"+(string.length() -15)+"s", " ");
        String stringFormat = "%s%s%s";
        System.out.printf(String.format(stringFormat,string,space,numberString));
        System.out.println();
    }

}
