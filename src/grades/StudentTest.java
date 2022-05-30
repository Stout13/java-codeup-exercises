package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student Mark = new Student();
        System.out.println(Mark.grades);
        Integer[] marksGrades = new Integer[]{100, 80, 95, 92, 88, 60};
        Collections.addAll(Mark.grades, marksGrades);
        System.out.println(marksGrades);
    }
}
