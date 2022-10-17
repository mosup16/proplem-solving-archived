package AlgorithmsAndDataStructure;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] ints = merge_sort(new int[]{2, 24, 43, 5, 46}, 0, 4);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] merge_sort(int[] arr, int first, int last) {
        int mid = (first + last) / 2;
        if (first < last && first < mid) {
            merge_sort(arr, first, mid);
            merge_sort(arr, mid + 1, last);
            return merge(arr, first, mid, last);
        }
//        return new int[]{arr[first]};
        return new int[0];

    }

    private static int[] merge(int[] arr, int first, int mid, int last) {
        int i = first;
        int j = mid;
        int n = 0;
        int[] c = new int[last - first];
        boolean done = false;
        while (!done) {
            if(arr[i] < arr[j])
                if (i < mid)
                    c[n++] = arr[i++];
            else if(j < last)
                 c[n++] = arr[j++];
            else if(n == c.length)
                done = true;
        }
        return c;
    }
}
