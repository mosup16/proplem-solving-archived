package AlgorithmsAndDataStructure.graph;

import java.util.function.Consumer;

public class DepthFirstSearchAlgorithm {

    private Graph<NodeVisitData> graph;

    public DepthFirstSearchAlgorithm(Graph<NodeVisitData> graph) {
        this.graph = graph;
    }

    public void DFS(Consumer<Node<NodeVisitData>> consumer) {

        setupGraph();
        processDFS(consumer, graph.getFirstNode());
        setupGraph();
    }

    private void setupGraph() {
        graph.getNodes().forEach(node -> node.setData(new NodeVisitData(false)));
    }

    private void processDFS(Consumer<Node<NodeVisitData>> consumer, Node<NodeVisitData> node) {
        consumer.accept(node);
        node.setData(new NodeVisitData(true));
        node.getEdges().forEach(edge -> {
           edge.ifActive(activeEdge -> {
                Node<NodeVisitData> next = edge.getTo();
                if (next != null && !next.getData().isVisited()) processDFS(consumer, next);
            });
        });
    }
}
