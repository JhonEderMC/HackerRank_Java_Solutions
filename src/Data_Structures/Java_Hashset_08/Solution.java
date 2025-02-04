package Data_Structures.Java_Hashset_08;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pairs = in.nextInt();

        HashSet<String> set = new HashSet<>();
        in.nextLine();

        while(pairs-- > 0){
            String left = in.next().trim();
            String right = in.next().trim();
            String pairLR = left + " " + right;
            String pairRL = right + " " + left;
            if(!set.contains(pairRL))
                set.add(pairLR);
            System.out.println(set.size());
        }

        in.close();
    }
}
