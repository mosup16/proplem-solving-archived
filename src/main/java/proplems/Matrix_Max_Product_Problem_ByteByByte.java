package proplems;

import java.util.Arrays;

public class Matrix_Max_Product_Problem_ByteByByte {

    public static void main(String... args) {


        /*    0  1  2
         * 0 [1 ,3 ,5]
         * 1 [4 ,7 ,2]
         * 2 [8 ,5 ,8]
         * */

        int[][] matrix1 = {
                 {-1 ,2 ,3},
                 {4 ,5 ,-6},
                 {7 ,8 , -9}
        };
           //   -1  -2  -6
           //   -4  -10  60
           //   -28 -80 540
        int[][] matrix2 = {
                {1 ,3 ,5},
                {4 ,7 ,2},
                {8 ,5 ,8}
        };
        System.out.println(Arrays.deepToString(matrix1));

        System.out.println(getMaxProduct_positive_input(matrix1));



    }

    // positive input
    public static int getMaxProduct_positive_input(int[][] matrix) {
        int[][] output = new int[matrix.length][matrix[0].length];
        output[0][0] = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int i2 = 0;
                int j2 = 0;
                if (i != 0) i2 = i-1;
                if (j != 0) j2 = j-1;
                int p = 0;
                // (0 , 0) = itself
                if (i == 0 && j == 0){
                    p = matrix[i][j];
                    System.out.println(matrix[i][j] + " * " + output[i2][j2] + " = " + p);
                }
                // to move horizontally or vertically we use this formula
                // output(0 , i) = input(0 , i) * output(0 , i - 1)
                // or
                // output(j , 0) = input(j , 0) * output(j - 1 , 0)
                else if(i ==0 || j == 0 ) {
                    p = matrix[i][j] * output[i2][j2];
                    System.out.println(matrix[i][j] + " * " + output[i2][j2] + " = " + p);
                }
                else {
                    int p1 = matrix[i][j] * output[i2][j];
                    int p2 = matrix[i][j] * output[i][j2];
                    p = Math.max(p1 ,p2);
                    System.out.println(matrix[i][j] + " * " + output[i2][j2] + " = " + p);
                }
              //  System.out.println(matrix[i][j] + " * " + output[i2][j2] + " = " + p);
                output[i][j] = p;
            }
        }
        System.out.println(Arrays.deepToString(output));
        return output[matrix.length-1][matrix[0].length-1];
    }

}
