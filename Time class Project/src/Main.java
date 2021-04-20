public class Main {
    public static void main(String[] args) {
        Time time = new Time(0, 0, 0);

        System.out.println("input time");
        System.out.println(time.toString());
        time.lastSecond();

        System.out.println("output time");
        System.out.println(time.toString());


    }
}