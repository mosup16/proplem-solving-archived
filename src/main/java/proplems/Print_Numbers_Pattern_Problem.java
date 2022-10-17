package proplems;

public class Print_Numbers_Pattern_Problem {
/*
 prints ->
            1 10 20 21 30
            2 9 19 22 29
            3 8 18 23 28
            4 7 17 24 27
            5 6 16 25 26
            6 5 15 26 25
            7 4 14 27 24
            8 3 13 28 23
            9 2 12 29 22
            10 1 11 30 21
*/

    public static void main(String[] args) {
        printNumbersPattern();
    }

    private static void printNumbersPattern() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
            System.out.print(10 - i);
            System.out.print(" ");
            System.out.print(20 - i);
            System.out.print(" ");
            System.out.print(20 + i +1);
            System.out.print(" ");
            System.out.print(30 - i );
            System.out.println();
        }
    }
}
