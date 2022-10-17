package APAS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddTowNumbers_2 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        List result = addTowNumbers(l1, l2);
        System.out.println(result);
    }

    private static List addTowNumbers(List l1, List l2){
        var result = new LinkedList<Integer>();
        int i = Math.max(l1.size(),l2.size()) - 1;
        int remaining = 0;
        while(i >= 0){
            int num1 = i < l1.size() ? (int) l1.get(i) : 0; // if list size is acceded then set to 0 else set to the value
            int num2 = i < l2.size() ? (int) l2.get(i) : 0;

            int sum = num1 + num2 + remaining;
            if (sum < 10) {
                result.addFirst(sum);
            } else {
                int ones = sum % 10;
                result.addFirst(ones);
                remaining = (sum - ones) / 10;
            }
            i--;
        }

        return result;
    }
}
