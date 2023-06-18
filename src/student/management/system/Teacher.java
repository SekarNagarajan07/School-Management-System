package student.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Create a new Teacher object
     * @param id for the teacher
     * @param name for the teacher
     * @param salary for the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     *set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;

    }
};

