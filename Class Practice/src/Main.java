public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // prints out student information
        System.out.println("student id # is " + student.idNum);
        System.out.println("Student name: " + student.getfullname());

// prints out student grade for each class
        
        System.out.println("-----Student grade on each class-----");
        int[] grade = new int[4];

        for (int i = 0; i < grade.length; i++) {

            grade[i] = (int) (Math.random() * 100) + 1;

        }
        System.out.println("Science" + " " + grade[0]);
        System.out.println("Math" + " " + grade[1]);
        System.out.println("Socials" + " " + grade[2]);
        System.out.println("computers" + " " + grade[3]);

        int average = 0;

        for (int i = 0; i < grade.length; i++) {
            average = average + grade[i] / 4;


        }
        //prints out student average mark
        System.out.println("the average grade is " + average + "%");








    }
}



