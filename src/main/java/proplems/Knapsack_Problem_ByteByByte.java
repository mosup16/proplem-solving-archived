package proplems;

import java.util.Date;

public class Knapsack_Problem_ByteByByte {

    private static int max_val;

    public static void main(String... args) {

        int[] values = {22, 25, 68, 30, 32};
        int[] weights = {10, 15, 38, 40, 17};
        int max_weight = 150;


        // recursive solution fails
//        int maxValue_recursively = getMaxValue_Recursively(weights, values, max_weight);
//        System.out.println(maxValue_recursively);


        int maxValue_iteratively = getMaxValue_Iteratively(weights, values, max_weight);
        System.out.println(maxValue_iteratively);

    }

    private static int getMaxValue_Iteratively(int[] weights, int[] values, int maxWeight){
        int max_value = 0;
        for (int i = 0; i < values.length; i++) {
            // we use j = i + 1 to skip duplicates and repeated values
            for (int j = i + 1 ; j < values.length; j++) {
                int weight_sum = weights[i] + weights[j];
                if (is_weight_Less_Than_Max_weight(maxWeight, weight_sum)) {
                    max_value = values[i] + values[j];

                   System.out.println(values[i] +" ,  "+ values[j] + " = " + max_value);
                }
            }
        }

        return max_value;
    }

    private static boolean is_weight_Less_Than_Max_weight(int max_weight, int weight_sum) {
        return weight_sum < max_weight;
    }

    private static int getMaxValue_Recursively(int[] weights, int[] values, int maxweight){
        max_val = 0;
        getMaxValue_Recursively(weights, values ,maxweight ,1);
         return max_val;
    }

    private static void getMaxValue_Recursively(int[] weights, int[] values, int maxweight, int index) {
        if (index == weights.length) return ;
        int val = values[index] + values[index - 1];
        if(maxweight > weights[index] + weights[index-1]){
            if(max_val < val) max_val = val;
        }
        System.out.println(values[index] +" ,  "+ values[index-1] + " = " + val);

        getMaxValue_Recursively(weights, values, maxweight ,index+1);
    }


}
