package ExamPractise1;
import ExamSolution1.java.Student;

import java.util.*;

class Students{
    int id;
    String name;
    float marks;

    public Students(int id , String name, float marks)
    {
        this.id=id;
        this.name=name;
        this.marks = marks;

    }



}
public class StudentList {
public static void main(String[] args){
        List<Students> StudentsList = new ArrayList<Students>();
        StudentsList.add(new Students(1, "Sunil", 100));
        StudentsList.add(new Students(2, "Pavan", 98));
        StudentsList.add(new Students(3, "Nirali", 97));
        StudentsList.add(new Students(4, "karan", 96));
        StudentsList.add(new Students(5, "sahil", 95));

        System.out.println("Highest Grade is:");

        Students StudentsA = StudentsList.stream().max((Students1, Students5) -> Students1.marks > Students5.marks ? 1 : 1).get();
        System.out.println(StudentsA.marks);

        System.out.println("Lowest Grade is:");
        Students StudentsB = StudentsList.stream().min((Students1, Students5) -> Students1.marks > Students5.marks ? 1 : 1).get();
        System.out.println(StudentsB.marks);


    }

}

