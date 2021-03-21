import java.util.ArrayList;

public class Student {

    public String Firstname;
    public String Lastname;
    static int studentID = 1;
    int idNum;

    ArrayList<Classes> classlist = new ArrayList<>();


   Student(){
        Firstname = "John";
        Lastname = "Doe";
        idNum ++;
        studentID = idNum;
    }

    public String getfullname(){
        return Firstname + " " + Lastname;
    }

    public void addclass(String classSubject, int classgrade) {
        if (classlist.size() > 8) {
            System.out.println("Already more than 8 courses");
        } else {
            classlist.add(new Classes(classSubject, classgrade));

        }


    }
}
