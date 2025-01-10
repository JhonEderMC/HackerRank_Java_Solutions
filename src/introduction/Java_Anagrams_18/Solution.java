package introduction.Java_Anagrams_18;

/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
* */


import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();

        char [] chars1 = string1.toLowerCase().toCharArray();
        char [] chars2 = string2.toLowerCase().toCharArray();

        boolean isAnagram1 = isAnagram(chars1, chars2);
        boolean isAnagram2 = isAnagram(chars2, chars1);
        System.out.println((isAnagram1 && isAnagram2) ? "Anagrams" : "Not Anagrams");

        /*
        Other solution
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
        */

    }

    private static boolean isAnagram(char [] chars1, char [] chars2) {
        boolean isAnagram = true;
        for(char aChar1: chars1) {
            int count1 = countNumberRepeatCharInChars(chars1, aChar1);
            int count2 = countNumberRepeatCharInChars(chars2, aChar1 );

            if(count1 != count2) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    private static int countNumberRepeatCharInChars(char [] chars, char c){
        int count = 0;
        for (char aChar : chars) {
            if (aChar == c) {
                count++;
            }
        }
        return count;
    }
}
