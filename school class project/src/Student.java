public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    public int studentID = 0;

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // sets the last name of the student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // sets the first name of the student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // sets the student grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // gets the last name of the student
    public String getLastName() {
        return lastName;
    }

    // gets the first name of the student
    public String getFirstName() {
        return firstName;
    }
    // returns the grade
    public int getGrade() {
        return grade;
    }

    // returns the student id
    public int getStudentID() {
        return studentID;
    }

    // when printed, shows name and grade

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }
}

