package proplems;

import java.util.Scanner;

/*
  prints ->
            B B B B B B
            B B B B B B
            B B B B B B
            B B B B B B
            B B B B B B
*/
public class Print_Box {
    public static void main(String[] args) {
        int height = getInput("height");
        int width = getInput("width");
        printBox(height, width ,"B");
    }

    private static int getInput(String massage) {
        System.out.println("Enter " + massage + " ->");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void printBox(int height, int width, String sample) {
        validate(height, width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(sample + " ");
            }
            System.out.println();
        }
    }

    private static void validate(int height, int width) {
        if (height == 0) throw new IllegalArgumentException("height can't be Zero");
        if (width == 0) throw new IllegalArgumentException("width can't be Zero");
    }
}
