package Object_Oriented_Programming.Java_Iterator_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

    public static void main(String []args){
        ArrayList<Object> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            myList.add(scanner.nextInt());
        }

        for(int i =0; i<m; i++){
            myList.add(scanner.next());
        }
        scanner.close();

        printList(myList);
    }

    public static void printList(ArrayList<Object> myList){
        Iterator<Object> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
             if (element instanceof String) {
                System.out.println(element);
            }
        }
    }
}
