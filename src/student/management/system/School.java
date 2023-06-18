package student.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and student
 * Using an ArrayList
 */
public class School {
    private List <Teacher> teachers;
    private List <Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
}
