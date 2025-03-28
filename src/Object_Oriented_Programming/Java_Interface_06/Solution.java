package Object_Oriented_Programming.Java_Interface_06;

import java.util.Scanner;

public class Solution {

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisor_sum(int n) {
            return sumOfDivisors(n);
        }

        private int sumOfDivisors(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        MyCalculator myCalculator = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic" );
        System.out.println(myCalculator.divisor_sum(n));
    }
}
