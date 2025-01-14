package introduction.Java_1D_Array_28;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = Stream.generate(scanner::nextInt).limit(n).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
