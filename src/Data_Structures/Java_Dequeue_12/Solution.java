package Data_Structures.Java_Dequeue_12;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
                int first = deque.removeFirst();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }
        scanner.close();
        System.out.println(maxUnique);
    }
}