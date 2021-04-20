public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;


    // teacher constructor
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // gets the first name of the teacher
    public String getFirstName() {
        return firstName;
    }
    // get the last name of the teacher
    public String getLastName() {
        return lastName;
    }
    // get the subject
    public String getSubject() {
        return subject;
    }
    // sets the first name of the teacher
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // sets the first name of the teacher
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // sets the subjects of the teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // prints the object as a string

    public String toString() {
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}