import java.io.*;

/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <=10; i++) {
            int result = i*n;
            printMultiplication(i, n, result);
        }

        bufferedReader.close();
    }

    public static void printMultiplication(int i, int n, int result) {
        String format = "%d x %d = %d";
        String print = String.format(format, n, i, result);
        System.out.println(print);
    }

}
