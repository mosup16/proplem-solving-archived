package AlgorithmsAndDataStructure.graph;

import java.util.LinkedList;
import java.util.function.Consumer;

public class BreadthFirstSearchAlgorithm {
    private Graph<NodeVisitData> graph;

    public BreadthFirstSearchAlgorithm(Graph<NodeVisitData> graph) {
        this.graph = graph;
    }

    public void BFS(Consumer<Node<NodeVisitData>> consumer) {

        setupGraph();
        processBFS(consumer);
        setupGraph();
    }

    private void setupGraph() {
        graph.getNodes().forEach(node -> node.setData(new NodeVisitData(false)));
    }

    private void processBFS(Consumer<Node<NodeVisitData>> consumer) {
        LinkedList<Node<NodeVisitData>> queue = new LinkedList<>();
        graph.getFirstNode().setData(new NodeVisitData(true));
        queue.addFirst(graph.getFirstNode());

        for (int i = 0; i < graph.getNodes().size(); i++) {
            if (queue.size() == 0) break;
            // System.out.println(queue.size());
            Node<NodeVisitData> node = queue.get(i);
            consumer.accept(node);
            queue.removeFirst();
            i--;
            node.getEdges().forEach(edge -> {
                if (edge != null) {
                    edge.ifActive(nodeVisitDataEdge -> {
                        Node<NodeVisitData> next = edge.getTo();
                        if (next != null && !next.getData().isVisited()) {
                            queue.addLast(next);
                            next.getData().setVisited(true);
                        }
                    });
                }
            });
        }
    }

//    private void temp(Consumer<Node<NodeVisitData>> consumer, Node<NodeVisitData> node) {
//        LinkedList<Node<NodeVisitData>> queue = new LinkedList<>();
//        node.setData(new NodeVisitData(true));
//        queue.addFirst(node);
//
//        for (int i =0; i < graph.getNodes().size();i++) {
//            if (queue.size() == 0) break;
//           // System.out.println(queue.size());
//            Node<NodeVisitData> node1 = queue.get(i);
//            consumer.accept(node1);
//            queue.removeFirst(); i--;
//            node1.getEdges().forEach(edge -> {
//                Node<NodeVisitData> next = edge.getTo();
//                if (next != null && !next.getData().isVisited()) {
//                    queue.addLast(next);
//                    next.getData().setVisited(true);
//                }
//            });
//        }
//    }
}
