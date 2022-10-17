package AlgorithmsAndDataStructure.graph;

public class Test {
    /*
    *               5   -    1
    *                    2   -   3
    *                  4          8
    *                6
    *              7
    * */
    public static void main(String[] args) {
        Graph<NodeVisitData> graph = new Graph<>();
        Node<NodeVisitData> node1 = new Node<>(1);
        Node<NodeVisitData> node2 = new Node<>(2);
        Node<NodeVisitData> node3 = new Node<>(3);
        Node<NodeVisitData> node4 = new Node<>(4);
        Node<NodeVisitData> node5 = new Node<>(5);
        Node<NodeVisitData> node6 = new Node<>(6);
        Node<NodeVisitData> node7 = new Node<>(7);
        Node<NodeVisitData> node8 = new Node<>(8);
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node1, node5);
        graph.addEdge(node2, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node6);
        graph.addEdge(node6, node7);
        graph.addEdge(node3, node8);
        graph.removeEdge(node2 ,node3);
//        new DepthFirstSearchAlgorithm(graph).DFS(System.out::println);
        new BreadthFirstSearchAlgorithm(graph).BFS(System.out::println);
    }
}
