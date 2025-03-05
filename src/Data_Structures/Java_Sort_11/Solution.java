package Data_Structures.Java_Sort_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = Double.parseDouble(in.next());

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(getComparetor());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

    public static Comparator<Student> getComparetor() { // automatic mode
        return Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparingInt(Student::getId);
    }

    /*public static Comparator<Student> getComparetor() { // manual mode
        return (student1, student2) -> {
            if (student1.getCgpa() == student2.getCgpa()) {
                if (student1.getFname().equals(student2.getFname())) {
                    return student1.getId() - student2.getId();
                } else {
                    return student1.getFname().compareTo(student2.getFname());
                }
            } else {
                return Double.compare(student2.getCgpa(), student1.getCgpa());
            }
        };
    }*/
}

