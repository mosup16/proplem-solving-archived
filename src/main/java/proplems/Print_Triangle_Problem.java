package proplems;

public class Print_Triangle_Problem {
    /*prints ->
                @
                @ @
                @  @
                @   @
                @    @
                @@@@@@
            */
    public static void main(String[] args) {
        printTriangle(5, "@");
    }

    public static void printTriangle(int n ,String sample) {
        System.out.println(sample);
        for (int i = 1; i < n; i++) {
            System.out.print(sample);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(sample);
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(sample);
        }
    }
}
