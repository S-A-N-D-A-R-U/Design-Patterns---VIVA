package adaptor;

import java.util.List;

public class AdaptorPatternDemo {
    public static void main(String args[]) {
        StudentList list = new StudentList();
        List<Student> studentList = list.getStudentList();
        System.out.println(studentList);

    }
}
