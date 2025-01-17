package BigNumber.Java_BigDecimal_01;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = enterData(n, scanner);
        List<BigDecimal >bigList = list.stream().map(BigDecimal::new).collect(Collectors.toList());

        sortedArray(n, bigList, list);
        scanner.close();
        list.forEach(System.out::println);
    }

    private static void sortedArray(int n, List<BigDecimal> bigList, List<String> list) {
        for(int i = 0; i< n -1; i++) {
            for(int j = 0; j< n -1; j++) {
                if(bigList.get(j).compareTo(bigList.get(j+1)) <0 ) {
                    String temp = list.get(j);
                    BigDecimal temp1 = bigList.get(j);
                    list.set(j, list.get(j+1));
                    bigList.set(j, bigList.get(j+1));
                    list.set(j+1, temp);
                    bigList.set(j+1, temp1);

                }
            }

        }
    }

    private static List<String> enterData(int n, Scanner scanner) {
        return IntStream.range(0, n)
                .mapToObj(i -> scanner.nextLine())
                .collect(Collectors.toList());
    }
}
