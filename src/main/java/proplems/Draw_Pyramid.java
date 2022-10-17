package proplems;

/*
j =n-j2      i -> 0
       *
     ***
    ****
   *****
* */

public class Draw_Pyramid {
    public static void main(String[] args) {
        drawPyramid(5);
    }

    public static void drawPyramid(int n){
        for (int i = 1; i <= 5; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // or
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < n ; j++) {
                if (j < n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
