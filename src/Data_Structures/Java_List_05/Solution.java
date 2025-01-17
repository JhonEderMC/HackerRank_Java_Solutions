package Data_Structures.Java_List_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class Solution {

    private static final String STRING_INSERT = "Insert";
    private static final String STRING_DELETE = "Delete";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // n is the number initial of elements in the list

        List<Integer> list = getIntegerList(scanner.nextLine());

        int numberOfQuerys = Integer.parseInt(scanner.nextLine());

        while (numberOfQuerys-- > 0) {
            String query = scanner.nextLine();
            List<Integer> queryList = getIntegerList(scanner.nextLine());

            if (query.equals(STRING_INSERT)) {
                list.add(queryList.get(0), queryList.get(1));
            } else if (query.equals(STRING_DELETE)) {
                list.remove((int) queryList.get(0)); // int -> index to delete, Integer -> object to delete
            }
        }
        scanner.close();
        list.forEach(number-> System.out.print(number + " "));
    }

    private static List<Integer> getIntegerList(String scanner) {
        return Arrays.stream(scanner.split(" ")).map(Integer::parseInt).collect(toList());
    }
}
