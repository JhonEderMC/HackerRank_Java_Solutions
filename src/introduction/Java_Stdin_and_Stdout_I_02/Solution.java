package introduction.Java_Stdin_and_Stdout_I_02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<3; i++) {
            System.out.println(readInputInteger(scanner));
        }

        scanner.close();
    }

    public static int readInputInteger(Scanner scanner) {
        return scanner.nextInt();
    }
}
