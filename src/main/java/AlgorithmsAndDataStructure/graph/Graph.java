package AlgorithmsAndDataStructure.graph;

import java.util.LinkedList;
import java.util.List;

public class Graph<T> {
    private List<Node<T>> nodes = new LinkedList<>();
    private List<Edge<T>> edges = new LinkedList<>();

    public List<Node<T>> getNodes() {
        return nodes;
    }

    public void addEdge(Node<T> from, Node<T> to) {
        from.setIndexInGraph(nodes.size() - 1);
        nodes.add(from);
        to.setIndexInGraph(nodes.size() - 1);
        nodes.add(to);
        Edge<T> edge = new Edge<>(from, to);
        edge.setIndexInGraph(edges.size() - 1);
        edges.add(edge);
    }

    public void removeEdge(int index) {
        Edge<T> edge = edges.get(index);
        edge.passivate();
//        edge.getTo().getEdges().remove(edge);
//        edge.getFrom().getEdges().remove(edge);
//        edges.set(index, null);
    }

//    public void removeEdge(EdgeContainer container) {
//        Edge edge = container.getEdge();
//        edge.passivate();
////        int index_in_node = container.getIndex_In_Node();
////        int index_in_other_node = container.getIndex_In_Other_Node();
////        NodeType nodeType = container.getNodeType();
////        if (NodeType.From_Node.equals(nodeType)) {
////            edge.getFrom().getEdges().remove(index_in_node);
////            edge.getTo().getEdges().remove(index_in_other_node);
////        } else {
////            edge.getTo().getEdges().remove(index_in_node);
////            edge.getFrom().getEdges().remove(index_in_other_node);
////        }
//    }

    public void removeEdge(Node<T> from, Node<T> to) {
        from.getEdges().forEach(edge -> {
            if (to != null & to.equals(edge.getTo())) {
                edge.passivate();
//                to.getEdges().remove(edge);
//                from.getEdges().remove(edge);
            }
        });
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    public Node<T> getFirstNode() {
        return nodes.get(0);
    }

}
