package Data_Structures.Java_Map_06;

import java.util.*;

/*
    Java Map
    https://www.hackerrank.com/challenges/java-map
You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.




Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // number of queries
        HashMap<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            phoneBook.put(name, phoneNumber);
        }

        while (scanner.hasNext()) {
            String nameSearch = scanner.nextLine();

            Integer number = phoneBook.get(nameSearch);
            System.out.println(number != null ? nameSearch +"="+ number : "Not found");
        }
        scanner.close();
    }
}
