package Exception_Handling.Java_Exception_Handling_Trycatch_01;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println(getText(e));
        }
    }

    private static String getText(Exception e) {
        return e.toString().contains(": For input") ? e.toString().substring(0, e.toString().indexOf(":")) : e.toString();
    }

}
