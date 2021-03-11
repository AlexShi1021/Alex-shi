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



        int arr[] = {0,1,2,3,4};
        int newarr[] = new int [n - 1];

        for (i = 0; i < arr.length; i++)
            newarr[i] = arr[i];
        for(int e: newarr){
            System.out.println(e);
        }



System.out.println("extended array");
        return newArray;



    }


    public static void main (String[] args){
        int n=5;

        int ele= 5;

        int inputarray[]= {0,1,2,3,4};

        for(int i: addnumber(n,inputarray,ele)){
            System.out.println(i);







        }









    }





}


