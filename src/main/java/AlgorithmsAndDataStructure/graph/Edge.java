package AlgorithmsAndDataStructure.graph;


import java.util.function.Consumer;

public class Edge<T> {

    private Node<T> from;
    private Node<T> to;
    private int indexInGraph;
    private int weight;
    private State state;

    public Edge(Node<T> from, Node<T> to) {
        setFrom(from);
        setTo(to);
        this.weight = 0;
        state = State.active;
    }

    public Edge(Node<T> from, Node<T> to, int weight) {
        setFrom(from);
        setTo(to);
        this.weight = weight;
    }

    public Node<T> getFrom() {
        return from;
    }

    public void setFrom(Node<T> from) {
        from.addEdge(this, NodeType.From_Node);
        this.from = from;
    }


    public Node<T> getTo() {
        return to;
    }

    public void setTo(Node<T> to) {
        to.addEdge(this, NodeType.To_Node);
        this.to = to;
    }

    public State getState() {
        return state;
    }

    private void setState(State state) {
        this.state = state;
    }

    public Edge<T> ifActive(Consumer<Edge<T>> operation){
        if (state.equals(State.active)) operation.accept(this);
        return this;
    }

    public Edge<T> ifPassive(Consumer<Edge<T>> operation){
        if (state.equals(State.passive)) operation.accept(this);
        return this;
    }

    public Edge<T> activate(){
        setState(State.active);
        return this;
    }

    public Edge<T> passivate(){
        setState(State.passive);
        return this;
    }

    public int getIndexInGraph() {
        return indexInGraph;
    }

    public void setIndexInGraph(int indexInGraph) {
        this.indexInGraph = indexInGraph;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
