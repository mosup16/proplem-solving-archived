package proplems;

public class Print_Stars_Problem {

    /* prints ->
                1*****
                12****
                123***
                1234**
                12345*
                123456

            */
    public static void main(String[] args) {
        printStars(6);
    }

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
