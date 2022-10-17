package AlgorithmsAndDataStructure;

import java.util.LinkedList;
import java.util.function.Consumer;

public class BFS {

    /*
     *
     *                 0
     *              1     3
     *            2          0*
     *          3*
     *    0  1  2  3
     * 0  0  0  0  1
     * 1  1  0  0  0
     * 2  0  1  0  0
     * 3  1  0  1  0
     */

    public static void main(String[] args) {
        int[][] graph = {
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {1, 0, 1, 0}
        };
        BFS(graph, 0, System.out::println);
    }

    public static void BFS(int[][] graph, int start, Consumer<Integer> consumer) {
        int current = start;
        int length = graph.length;
        int[] visited = new int[length]; // if 1 then it is visited else if 0 it isn't
        var queue = new LinkedList<Integer>();
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.removeFirst(); // poll the visited vertex from the queue
            consumer.accept(current); //process vertex
            visited[current] = 1; // set the polled vertex to visited
            //loop through the rows of the graph to find the edges and get the corresponding vertex
            for (int i = 0; i < length; i++) {
                if (graph[i][current] == 1 && visited[i] == 0) { // if edge is found and it wasn't visited
                    queue.addLast(i); // add the corresponding vertex to the queue
                }
            }
        }

    }

}
