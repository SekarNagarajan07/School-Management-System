package student.management.system;

/*This class is responsible for keeping the
* track of students fees, name, grade & fees paid*/
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    /**
     * To create a new student by initialzing.
     * Fees for every student is 20000.
     * Fees paid initial is 0.
     *
     * @param id    for the student : unique
     * @param name  of the student
     * @param grade of the student
     */
    public Student(int id, String name, int grade) {
        this.feespaid = 0;
        this.feesTotal = 20000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name,id.

    /**
     * Used to update the student's grade
     *
     * @param grade new grade of the student
     */
    public void getGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feespaid field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees) {
        feespaid += fees;
        School.updateTotalMoneyEarned(feespaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */

    public String getName() {
        return name;
    }
    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeespaid() {
        return feespaid;
    }

    /**
     *
     * @return the total fees of the students
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public  int getRemainingFees() {
       return feesTotal - feespaid;
    }

    @Override
    public String toString() {
        return "Student name :" + name +
                " Total fees Paid ₹ " + feespaid ;
    }

}
