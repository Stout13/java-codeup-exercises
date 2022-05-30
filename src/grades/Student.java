package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public static void main(String[] args) {
    }
    public String name = "Bjork";
    public List<Integer> grades = new  ArrayList<Integer>();
    public Student() {

    }
    public Student(String nombre) {
        name = nombre;
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade) {

        this.grades.add((int) grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        double numAsmt = 0;
        for (Integer grade : grades) {
            sum += grade;
            numAsmt += 1;
        }
        return sum / numAsmt;
    }
}
