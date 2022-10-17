package proplems;

public class Sum_Of_Subsets_Problem {

    public static void main(String[] args) {
        int[] values = {5, 10, 12, 13, 15, 18};
        int max = 30;
        getSubsetWithMaxSum(values, max, 0, 0);
    }

//    private static int[] getSubsetWithMaxSum(int[] values, int max_sum, int start) {
//        int all_sum = 0;
//        int sum = 0;
//        for (int i = start; i < values.length; i++) {
//            all_sum += values[i];
//        }
//        for (int i = start; i < values.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                int temp_sum = sum;
//                if(temp_sum > max_sum){
//                        // don't
//                    }else {
//                        temp_sum += values[i];
//                        //include
//                    }
//
//                    // include i ..end
//            }
//        }
//        return new int[0];
//    }

    private static int[] getSubsetWithMaxSum(int[] values, int max_sum, int start, int sum) {
        boolean[] solution = new boolean[values.length - start];
        int i = 0;
        boolean should_be_included = false;
        if (should_be_included) { //if sum of included values + values[start] < max
            include(values, solution, max_sum, start, sum, i);
        } else {
            doNotInclude(values, solution, max_sum, start, sum, i);
        }
        return values;
    }

    private static void doNotInclude(int[] values, boolean[] solution, int max_sum, int start, int sum, int i) {
        solution[start] = false;
        getSubsetWithMaxSum(values, max_sum, start + 1, sum);
    }

    private static void include(int[] values, boolean[] solution, int max_sum, int start, int sum, int i) {
        solution[i] = true;
        getSubsetWithMaxSum(values, max_sum, start + 1, sum);
    }

}
