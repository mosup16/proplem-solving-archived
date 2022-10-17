package proplems.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//@Solved
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float pCounter = 0;
        float nCounter = 0;
        float zCounter = 0;
        for (int i : arr) {
            if (i< 0) nCounter++;
            if (i > 0) pCounter++;
            if (i == 0) zCounter++;
        }
        int length = arr.length;
        float p = pCounter / length;
        float n = nCounter / length;
        float z = zCounter / length;
        System.out.println(String.format("%.6f", p));
        System.out.println(String.format("%.6f", n));
        System.out.println(String.format("%.6f", z));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}