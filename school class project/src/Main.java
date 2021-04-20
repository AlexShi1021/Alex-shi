public class Main {
    public static void main(String[] args) {

        School school = new School("Windermere Secondary", 50);

        //10 students in an arraylist

        school.addStudent("Timmy","Wong",9);
        school.addStudent("Alex","Shi",10);
        school.addStudent("Jennifer","Wu",11);
        school.addStudent("Jim","Son",12);
        school.addStudent("Scott","Smith",8);
        school.addStudent("Maria","madonna",12);
        school.addStudent("Gloria","Wood",10);
        school.addStudent("Matt","King",9);
        school.addStudent("Vaughn","Huck",8);
        school.addStudent("Penny","Corine",11);

       System.out.println("--Students list---");
        System.out.println(school.showAllStudents());

        // adds 3 teachers into the arraylist

        school.addTeacher("Brianne","Marshall","Calculus");
        school.addTeacher("Tony","Stark","physics");
        school.addTeacher("Johnny","White","Physical education");


        System.out.println("---Teachers List---");
        System.out.println(school.showAllTeachers());
    }
}