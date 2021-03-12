public class Main {
    public static int[] addnumber(int n, int inputarray[], int ele) {
        int i;
// int n = the outputarray

        int newArray[] = new int[n + 1];


System.out.println("---input array---");

        for (i = 0; i < inputarray.length; i++)
            newArray[i] = inputarray[i];
        for(int j: newArray){
            System.out.println(j);
        }

        newArray[n] = ele;


System.out.println("extended array");
        return newArray;

    }

    public static int[] deletearrayindex(int[] inputArray) {
        int[] newArray = new int[inputArray.length - 1];
        for (int x = 0; x < newArray.length; x++) {
            newArray[x] = inputArray[x];
        }

        return newArray;
    }


    public static void main (String[] args){
        int n=5;

        int ele= 5;

        int inputarray[]= {0,1,2,3,4};

        for(int i: addnumber(n,inputarray,ele)){
            System.out.println(i);



// second method - prints out decreased size
            int[] Method2 = {1, 2, 3};
            System.out.println("Original Array");
            System.out.println(Method2);


            Method2 = deletearrayindex(Method2);
            System.out.println("New Array with decreased size");
            System.out.println(Method2);







        }
