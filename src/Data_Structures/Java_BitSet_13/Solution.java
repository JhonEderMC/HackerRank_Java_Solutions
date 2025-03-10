package Data_Structures.Java_BitSet_13;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        for(int i=0; i<m; i++) {
            String command = scanner.next();
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            executeBisetCommand(bitSet1, bitSet2, command, index1, index2);
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }

    public static void executeBisetCommand(BitSet bitSet1, BitSet bitSet2, String command, int index1, int index2) {
        BitSet target = (index1 == 1) ? bitSet1 : bitSet2;
        BitSet other = (index1 == 1) ? bitSet2 : bitSet1;

        switch (command) {
            case "AND" -> target.and(other);
            case "OR" -> target.or(other);
            case "XOR" -> target.xor(other);
            case "SET" -> target.set(index2);
            case "FLIP" -> target.flip(index2);
        }
    }

}
