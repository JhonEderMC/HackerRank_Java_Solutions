package Introduction.Java_Loops_II_07;

import java.util.*;

/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInputs = scanner.nextInt();
        for (int i = 0; i <numberInputs; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            printSeries(a, b, n);
        }
    }

    public static void printSeries(int a, int b, int n) {
        int result = 0;
        for(int i=0; i<n; i++) {
            if(i==0) {
                result = a + b;
            } else {
                result += Math.pow(2, i)*b;
            }
            System.out.print(result + " ");
        }
        System.out.println();
    }


}