package introduction.Java_Int_to_String_11;

import java.util.*;

/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.

Sample Input 0

100
Sample Output 0

Good job
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        try {
            if(numberInRange(number)){
                String numberString = String.valueOf(number);
                System.out.print("Good job");
            }

        }catch(Exception exception) {
            System.out.println("Wrong answer");
        }
    }

    public static boolean numberInRange(int number) {
        return number >=-100 && number <= 100;
    }
}
