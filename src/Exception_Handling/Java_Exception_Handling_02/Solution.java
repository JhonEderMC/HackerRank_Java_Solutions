package Exception_Handling.Java_Exception_Handling_02;

import java.util.Scanner;

public class Solution {

    private static MyCalculator myCalculator = new MyCalculator();
    private static Scanner scanner = new Scanner(System.in);

    static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }

            return (long) Math.pow(n, p);
        }
    }


    public static void main(String[] args) {
        while (scanner.hasNextInt()) {
            try  {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                long result = myCalculator.power(x, y);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

}
