package src;

public class Edge {
    Vertex v1;
    Vertex v2;

    Edge(Vertex v1, Vertex v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "(" + v1 + ", " + v2 + ")";
    }
}
