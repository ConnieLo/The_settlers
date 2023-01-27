import java.utils

public class Hexagonal_Grid {

    private static Map<Vertex, List<Vertex>> adjVertices; //Map to hold the vertices

    Hexagonal_Grid(){
        for(int i; i < 54; i++){

        }
    }

    public void addVertex(int label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void addEdge(int label1, int label2){
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }
}
