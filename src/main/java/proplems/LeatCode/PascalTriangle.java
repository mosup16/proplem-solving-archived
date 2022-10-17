package proplems.LeatCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        print_list(pascal_triangle(10));
    }

    public static List<List<Integer>> pascal_triangle(int rowsNum) {
        var triangle = new LinkedList<List<Integer>>();
        triangle.add(Collections.singletonList(1)); // ad the first row
        for (int i = 1; i < rowsNum; i++) { // create every row
            var row = new LinkedList<Integer>();
            var prev_row = triangle.get(i - 1); // get previous row
            row.add(1); // add one at the beginning
            for (int j = 1; j < i; j++) { // creat a row
                // entry = prev_row[j-1] + prev_row[j]
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1); //add one at the ending
            triangle.add(row);
        }
        return triangle;
    }

    private static void print_list(List list){
        list.forEach(System.out::println);
    }

}
