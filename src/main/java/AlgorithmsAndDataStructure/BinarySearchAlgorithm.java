package AlgorithmsAndDataStructure;

import java.util.Arrays;

public class BinarySearchAlgorithm {


    private static int mid;
    private static boolean value_found;
    private static boolean value_inside_right_side;
    private static boolean value_inside_left_side;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[] arr = new int[5000000]; // 500,000,000 n max value without printing
        for (int i = 0; i < 5000000; i++) {
            arr[i] = (i + 1)*2 + (i % 2);
        }
        System.out.println(Arrays.toString(arr)); // 50,000,000 n max value with printing
        System.out.println(findValueByRecursiveMethod(arr ,9208678));
    }

    /**
     * @param arr
     * @param value
     * @return
     */
    public static int findByIterativeMethod(int[] arr, int value){
        int first = 0;
        int last = arr.length - 1;
        int mid = 0;
        boolean value_found;
        boolean value_inside_right_side;
        boolean value_inside_left_side;
        while(first <= last){
            mid = (first + last)/2;
            value_found             =  (value == arr[mid]);
            value_inside_right_side =  (value >  arr[mid]);
            value_inside_left_side  =  (value <  arr[mid]);

            if (value_found) return mid;
            if (value_inside_right_side) first = mid + 1; //go right
            if (value_inside_left_side) last = mid - 1;  // go left
        }

        return -1;
    }

    public static int findValueByRecursiveMethod(int[] arr , int value){
        int first = 0;
        int last = arr.length - 1;
        return findValueByRecursiveMethod(arr ,value ,first ,last);
    }

    private static int findValueByRecursiveMethod(int[] arr, int value, int first, int last) {
        mid = (first + last)/2;
        value_found = (value == arr[mid]);
        value_inside_right_side = (value > arr[mid]);
        value_inside_left_side = (value < arr[mid]);

        if (first > last) return -1;
        if (value_found) return mid;
        if (value_inside_right_side) return goRight(arr ,value ,first ,last); //go right
        if (value_inside_left_side) return goLeft(arr ,value ,first ,last);  // go left
        return -1;
    }

    private static int goLeft(int[] arr, int value, int first, int last) {
        last = (first + last)/2 - 1;
        return findValueByRecursiveMethod(arr, value, first, last);
    }

    private static int goRight(int[] arr, int value, int first, int last) {
        first = (first + last)/2 + 1;
        return findValueByRecursiveMethod(arr, value, first, last);
    }


}
