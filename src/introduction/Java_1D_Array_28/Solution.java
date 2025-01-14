package introduction.Java_1D_Array_28;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

 he code above prints the value stored at index  of , which is  (the value we previously stored there). It's important to note that while Java initializes each cell of an array of integers with a , not all languages do this.

Task

The code in your editor does the following:

Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
Attempts to print each element of an array of integers named .
Write the following code in the unlocked portion of your editor:

Create an array, , capable of holding  integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
Good luck!

Input Format

The first line contains a single integer, , denoting the size of the array.
Each line  of the  subsequent lines contains a single integer denoting the value of element .

Output Format

You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.

Sample Input

5
10
20
30
40
50
Sample Output

10
20
30
40
50*
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = Stream.generate(scanner::nextInt).limit(n).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
