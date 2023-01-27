import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Hexagonal_Grid {

    public static Map<Vertex, List<Vertex>> adjVertices; //Map to hold the vertices. Are these correct Access modifiers?

    Hexagonal_Grid(){
        for(int i = 0; i < 54; i++){
            addVertex(i);
        }
    }

    public void addVertex(int label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>()); //adds vertex to the map with empty adjacency list
    }

    public void addEdge(int label1, int label2){ //adds adjancecy to each vertex's adjacency list
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public List<Vertex> getAdjVertices(int v){ //returns list of all corners a given corner connects to (can be used to find edges also)
        return adjVertices.get(new Vertex(v));
    }
}
