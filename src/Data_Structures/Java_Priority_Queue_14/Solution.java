package Data_Structures.Java_Priority_Queue_14;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = in.nextInt();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getId)
        );

        while (totalEvents-- > 0) {
            String event = in.next();
            switch (event) {
                case "ENTER" -> {
                    String name = in.next();
                    double cgpa = Double.parseDouble(in.next());
                    int id =  Integer.parseInt(in.next());
                    priorityQueue.add(new Student(id, name, cgpa));
                }
                case "SERVED" -> priorityQueue.poll();
            }
        }
        in.close();

        if (priorityQueue.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!priorityQueue.isEmpty()) {
                System.out.println(priorityQueue.poll().getName());
            }
        }
    }
}



class Student {

    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
