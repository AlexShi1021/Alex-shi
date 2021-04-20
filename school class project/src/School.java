import java.util.ArrayList;

public class School {

    // all the datatypes of the school
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    public String schoolName;
    public int numOfStudents;


    // School constructor
    public School(String schoolName, int numOfStudents) {
        this.schoolName = schoolName;
        this.numOfStudents = numOfStudents;
    }


    // sets the number of students
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }


    // gets the total number of the students
    public int getNumOfStudents() {

        return numOfStudents;
    }


    // adds to the teacher list as a method
    public void addTeacher(String firstName, String lastName, String subject) {
        teachers.add(new Teacher(firstName, lastName, subject));
    }

    // adds to the student List as a method
    public void addStudent(String firstName, String lastName, int grade) {
        students.add(new Student(firstName, lastName, grade));
    }


    // shows all the teachers in an arraylist
    public String showAllTeachers() {
        String listofteachers = "[";
        for (int i = 0; i < teachers.size(); i++) {
            if (i == teachers.size() - 1) {
                listofteachers += teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName();
                break;
            }
            listofteachers += teachers.get(i).getFirstName() + " " + teachers.get(i).getLastName() + ", ";

        }
        listofteachers += "]";
        return listofteachers;
    }


    // shows all the students in an arraylist
    public String showAllStudents() {
        String listofstudents = "[";
        for (int i = 0; i < students.size(); i++) {
            if (i == students.size() - 1) {
                listofstudents += students.get(i).getFirstName() + " " + students.get(i).getLastName();
                break;
            }
            listofstudents += students.get(i).getFirstName() + " " + students.get(i).getLastName() + ", ";
        }
        listofstudents += "]";
        return listofstudents;
    }


}