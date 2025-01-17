package Strings.Java_Strings_Introduction_01;

import java.util.Scanner;

/*
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".

*/


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        scanner.close();


        System.out.println(sumTwoStringLength(string1, string2));
        System.out.println(stringIsGreaterYesNo(string1, string2));
        System.out.println(capitalizate(string1)+ " "+ capitalizate(string2));
    }

    private static int sumTwoStringLength(String string1, String string2){
        int length = 0;
        if(string1 != null) {
            length += string1.length();
        } if(string2 != null) {
            length += string2.length();
        }
        return length;
    }

    private static String stringIsGreaterYesNo(String string1, String string2) {
        if(string1 != null && string2 != null ){
            String s1 = string1.toLowerCase();
            String s2 = string2.toLowerCase();
            return s1.compareTo(s2) > 0 ? "Yes" : "No";
        } else if(string1 != null) {
            return "Yes";
        } else if ( string2 != null) {
            return "No";
        }
        return "No";
    }

    private static String capitalizate(String string) {
        return string != null ?  string.substring(0, 1).toUpperCase() + string.substring(1) : "";
    }
}

