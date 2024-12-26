package introduction.Java_Datatypes_08;

import java.util.*;

/*
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

Input Format

The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/

public class Solution {
    public static String STRING_FORMAT_CAN_BE_FILTERED = "%s can be fitted in:";
    public static String STRING_FORMAT_CAN_NOT_BE_FITTED = "%s can't be fitted anywhere.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            try {
                long number = scanner.nextLong();

                printCanBeFittedIn(number);
                if(numberBetween(number, Byte.MIN_VALUE, Byte.MAX_VALUE)) {
                    printByte();
                    printShort();
                    printInteger();
                    printLong();
                }
                else if(numberBetween(number, Short.MIN_VALUE, Short.MAX_VALUE)) {
                    printShort();
                    printInteger();
                    printLong();
                }

                else if (numberBetween(number, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                    printInteger();
                    printLong();
                } else if(numberBetween(number, Long.MIN_VALUE, Long.MAX_VALUE)) {
                    printLong();
                }
            } catch (Exception e) {
                System.out.println(String.format(STRING_FORMAT_CAN_NOT_BE_FITTED, scanner.next()));
            }
        }
        scanner.close();
    }

    public static void printCanBeFittedIn(long number) {
        System.out.println(String.format(STRING_FORMAT_CAN_BE_FILTERED, number));
    }

    public static boolean numberBetween(long number, long min_value, long max_value){
        return number >= min_value && number <= max_value;
    }

    public static void printByte() {
        System.out.println("* byte");
    }

    public static void printShort() {
        System.out.println("* short");
    }

    public static void printInteger() {
        System.out.println("* int");
    }

    public static void printLong() {
        System.out.println("* long");
    }

}