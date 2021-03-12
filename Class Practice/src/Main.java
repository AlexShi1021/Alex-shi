
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

// prints out student information
        System.out.println("student id # is " + student.idNum);
        System.out.println("Student name: " + student.getfullname());

// prints out student grade for each class
        System.out.println("-----Student grade on each class-----");
        int[] grade = new int[8];

        for (int i = 0; i < grade.length; i++) {

            grade[i] = (int) (Math.random() * 100) + 1;

            System.out.println(grade[i]);

        }

        int average = 0;

        for (int i = 0; i < grade.length; i++) {
            average = average + grade[i] / 8;


        }
        //prints out student average mark
        System.out.println("the average grade is " + average);








    }
}
