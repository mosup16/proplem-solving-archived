package proplems.LeatCode;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicates {


    public static boolean findDuplicatesByUsingHashSet(int[] arr){
        var lookup = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!lookup.contains(arr[i]))
                lookup.add(arr[i]);
                else return true;
        }
        return false;
    }
    public static boolean findDuplicatesByUsingSorting(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        for (; i < arr.length; i++ , j++) {
            if (arr[i] == arr[j])
                return true;
        }
        return false;
    }

}
