package student.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher janu = new Teacher(1,"janu",20000);
        Teacher sakshi = new Teacher(2,"sakshi",15000);
        Teacher kumar = new Teacher(3,"kumar",30000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(janu);
        teacherList.add(sakshi);
        teacherList.add(kumar);

        Student ram = new Student(1, "ram",5);
        Student sekar = new Student(2, "sekar",10);
        Student srini = new Student(3, "srini",15);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ram);
        studentList.add(sekar);
        studentList.add(srini);

        School MahendraSchool = new School(teacherList,studentList);
//        System.out.println(MahendraSchool.getTotalMoneyEarned());
    }
}

