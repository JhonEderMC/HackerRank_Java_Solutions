package Introduction.Java_Stdin_And_Stdout_II_04;

import java.util.*;

/*
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + integerNumber);
    }
}