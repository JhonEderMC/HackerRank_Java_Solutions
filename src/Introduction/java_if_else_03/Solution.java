package Introduction.java_if_else_03;

import java.io.*;

/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .
*/

public class Solution {
    public static String WEIRD = "Weird";
    public static String NOT = "Not";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        printIsWeirdNumber(number);

        bufferedReader.close();
    }

    public static boolean isEven(int number) {
        return number %2 == 0;
    }

    public static void printIsWeirdNumber(int number) {
        if(!isEven(number)) {
            System.out.println(WEIRD);
        } else if (number >= 2 && number <= 5) {
            System.out.println(NOT +" "+WEIRD);
        }else if (number >= 6 && number <= 20) {
            System.out.println(WEIRD);
        } else if (number > 20) {
            System.out.println(NOT +" "+WEIRD);
        }
    }


}

