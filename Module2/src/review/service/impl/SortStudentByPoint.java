package review.service.impl;

import review.model.Student;

import java.util.Comparator;

public class SortStudentByPoint implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getPoint() > student2.getPoint()) {
            return 1;
        }
        return -1;
    }
}
