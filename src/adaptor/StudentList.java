package adaptor;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent(  "a",  "b",  "c");

        SchoolStudent schoolStudent = new SchoolStudent(  "x",  "y",  "z");

        students.add(collegeStudent);

//        students.add(schoolStudent);

        // Use adapter to add a SchoolStudent to the list
        SchoolStudentAdapter schoolStudentAdapter = new SchoolStudentAdapter(schoolStudent);
        students.add(schoolStudentAdapter);


        return students;
    }
}
