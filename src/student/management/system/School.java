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

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the element
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supported to be added.
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the return money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * which is the salary given by the school to its teachers.
     * @param moneySpent the money spent by school.
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-= moneySpent;
    }
}
