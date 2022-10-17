package proplems.LeatCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TowNumbersSum {

    public static void main(String[] args) {
        towNumSum(new int[]{1, 2, 3, 4, 5, 6}, 5).forEach(it -> System.out.println(Arrays.toString(it)));
    }

    public static List<Integer[]> towNumSum(int[] arr, int target) {

        List<Integer[]> result = new LinkedList<>();
        boolean done = false;
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        while (!done) {
            if (i < j) {
                sum = arr[i] + arr[j];
                if (sum == target)
                    result.add(new Integer[]{i++, j--});
                else if (sum < target)
                    i++;
                else j--;
            } else done = true;

        }

        return result;
    }
}
