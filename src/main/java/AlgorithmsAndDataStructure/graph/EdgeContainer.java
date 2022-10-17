package AlgorithmsAndDataStructure.graph;

public class EdgeContainer<T> {

    private Edge<T> edge;
    private int index_In_Node;
    private int index_In_Other_Node;
    private NodeType nodeType;

    public EdgeContainer() {
    }

    public EdgeContainer(Edge<T> edge) {
        this.edge = edge;
    }


    public Edge<T> getEdge() {
        return edge;
    }

    public void setEdge(Edge<T> edge) {
        this.edge = edge;
    }

    public int getIndex_In_Node() {
        return index_In_Node;
    }

    public void setIndex_In_Node(int index_In_Node) {
        this.index_In_Node = index_In_Node;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public int getIndex_In_Other_Node() {
        return index_In_Other_Node;
    }

    public void setIndex_In_Other_Node(int index_In_Other_Node) {
        this.index_In_Other_Node = index_In_Other_Node;
    }
}
