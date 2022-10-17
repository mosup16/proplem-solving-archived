package AlgorithmsAndDataStructure.graph;

public class NodeVisitData {

    private boolean visited;

    public NodeVisitData() {
    }

    public NodeVisitData(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
