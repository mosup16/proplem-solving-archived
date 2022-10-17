import java.math.BigDecimal;

public class MathTest {


    public static void main(String[] args) {
        int realIndex = 10 % 10;
        System.out.println(realIndex); // real index = given index % array size
        System.out.println((10) / 10); // array index = given index / array size

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < 6500; i++) {
            double pow = Math.pow(2, i);
            sum = sum.add(BigDecimal.valueOf((i + 1) / pow));
            System.out.println(pow);
        }
        System.out.println("sum -> " + sum);
    }
}
