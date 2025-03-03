package Data_Structures.Java_Generics_9;

import java.util.ArrayList;

public class Solution {

    public static  void main(String [] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("Hello");
        list.add("World");

        printArray(list.toArray());
    }

   public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
   }
}
