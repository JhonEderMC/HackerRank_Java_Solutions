package introduction.Java_BigInteger_27;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());
        scanner.close();

        BigInteger sum = number1.add(number2);
        BigInteger multiply = number1.multiply(number2);

        System.out.println(sum);
        System.out.println(multiply);
    }

}
