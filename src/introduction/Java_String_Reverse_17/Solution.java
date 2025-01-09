package introduction.Java_String_Reverse_17;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputText=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(isPalindromeWord(inputText) ? "Yes" : "No");

        /*
        Other solution
          String B=new StringBuilder(A).reverse().toString();

        if(A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");

        }
         */
    }

    private static boolean isPalindromeWord(String string) {
        boolean isPalindrome = true;

        for(int i=0; i<string.length()/2; i++) {
            if(string.charAt(i) != string.charAt(string.length()-1-i) ){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
