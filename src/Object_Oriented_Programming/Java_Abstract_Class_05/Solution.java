package Object_Oriented_Programming.Java_Abstract_Class_05;

import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}

public class Solution {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Book book = new MyBook();

        book.setTitle(title);
        System.out.println("The title is:" +book.getTitle());
        sc.close();
    }
}
