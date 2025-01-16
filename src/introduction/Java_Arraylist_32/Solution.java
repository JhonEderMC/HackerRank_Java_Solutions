package introduction.Java_Arraylist_32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfArrays = getInputNumber(scanner);
        int numberOfQuerys = 0;
        List<List<Integer>> arraysOfNumbers = new ArrayList<>();
        List<List<Integer>> arrayOfQuery = new ArrayList<>();// x , y in every query

        for (int i = 0; i < numberOfArrays; i++) {
            List<Integer> list = getInputListNumbers(scanner);
            list.remove(0);
            arraysOfNumbers.add(list);
        }

        numberOfQuerys = getInputNumber(scanner);
        while (numberOfQuerys-- > 0) {
            arrayOfQuery.add(getInputListNumbers(scanner));
        }
        scanner.close();

        arrayOfQuery.forEach(list -> {
            int x = list.get(0); // position in array of numbers
            int y = list.get(1);// position in array
            printNumber(x, numberOfArrays, arraysOfNumbers, y);
        });
    }

    private static void printNumber(int x, int numberOfArrays, List<List<Integer>> arraysOfNumbers, int y) {
        if(x <0 || x > numberOfArrays){
            System.out.println("ERROR!");
        }
        List<Integer> array = arraysOfNumbers.get(x -1);
        try{
            System.out.println(array.get(y -1));
        }catch (Exception e){
            System.out.println("ERROR!");
        }
    }

    private static int getInputNumber(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static List<Integer> getInputListNumbers(Scanner scanner) {
        return Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(toList());
    }
}
