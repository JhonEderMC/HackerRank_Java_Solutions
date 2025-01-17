package Data_Structures.Java_Subarray_02;

import java.util.Arrays;
import java.util.Scanner;

/*
We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int countNegativeSubArrays = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] tempArray = new int[j+1];

                if (tempArray.length - i >= 0) {
                    System.arraycopy(arr, i, tempArray, i, tempArray.length - i);
                }

                int sum=  Arrays.stream(tempArray).sum();
                if (sum < 0) {
                    countNegativeSubArrays++;
                }
            }
        }
        System.out.println(countNegativeSubArrays);
    }
}
