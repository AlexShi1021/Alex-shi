public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 6) + 1;

            System.out.println(array[i]);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;

            }

        }
        System.out.println(" ones count: " + count);
//second question - average of 1-100 random 10x
        int[] value = new int[10];
        int average = 0;
        int X = value[0];
        int Y = value[1];

        for (int i = 0; i < value.length; i++) {
            value[i] = (int) (Math.random() * 100) + 1;
// third question - swapping value X and Y // x = y and y = x
            X = Y;
            Y = X;


            System.out.println(value[i]);


        }
        for (int i = 0; i < value.length; i++) {
            average = average + value[i] / 10;


        }
        System.out.println("the average is " + average);

        // last question - reverse the order of the array
        int[] reverse = new int[6];
        int zero = reverse[5];
        int one = reverse[4];
        int two = reverse[3];
        int three = reverse[2];
        int four = reverse[1];
        int five = reverse[0];


        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = (int) (Math.random() * 100) + 1;

            zero = five;
            one = four;
            two = three;
            three = two;
            four = one;
            five = zero;

            System.out.println(reverse[i]);


        }
    }
}








