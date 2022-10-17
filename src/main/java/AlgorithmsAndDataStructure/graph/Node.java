package AlgorithmsAndDataStructure.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Node<T> {

    private List<Edge<T>> edges = new LinkedList<>();
    private T data;
    private int indexInGraph;
//    private List<EdgeContainer<T>> edgesContainers = new LinkedList<>();

    private int value;


    public Node(int value) {
        this.value = value;
    }

//    public List<EdgeContainer<T>> getEdgesContainers() {
//        return edgesContainers;
//    }
    public void addEdge(Edge<T> edge, NodeType NodeType) {
//        EdgeContainer<T> edgeContainer = new EdgeContainer<>(edge);
//        edgeContainer.setIndex_In_Node(edgesContainers.size() - 1);
//        edgeContainer.setNodeType(NodeType);
        edge.activate();
        this.edges.add(edge);
//        this.edgesContainers.add(edgeContainer);
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getIndexInGraph() {
        return indexInGraph;
    }

    public void setIndexInGraph(int indexInGraph) {
        this.indexInGraph = indexInGraph;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", indexInGraph=" + indexInGraph +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return indexInGraph == node.indexInGraph && value == node.value && data.equals(node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, indexInGraph, value);
    }
}
