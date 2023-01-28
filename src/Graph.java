package src;
import java.util.*;

public class Graph{

    private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>(); //Map to hold the vertices
    // The HashMap is used because it provides basic operations like get and put,
    // which are used in the addVertex and addEdge methods.

    public Graph (){
        adjVertices = new HashMap<>(); //idk you can change this
    }

    //adds vertex to the map with empty adjacency list
    public Vertex addVertex(int label) {
        Vertex vertex = new Vertex(label);
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
        return vertex;
    }

    public Vertex getVertexByLabel(int label) {
        for (Vertex vertex : adjVertices.keySet()) {
            if (vertex.label == label) {
                return vertex;
            }
        }
        return null;
    }

    public void addEdge(int label1, int label2){ //adds adjacency to each vertex's adjacency list
        Vertex v1 = getVertexByLabel(label1);
        Vertex v2 = getVertexByLabel(label2);
        //checks if the vertex already exists in the map
        if(!adjVertices.containsKey(v1))
            v1 = addVertex(label1);
        if(!adjVertices.containsKey(v2))
            v2 = addVertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    //returns a list of edges for a given vertex label
    public List<Edge> getAdjVertices(int label){
        Vertex vertex = new Vertex(label);
        if (!adjVertices.containsKey(vertex)) {
            return null;
        }
        List<Edge> edges = new ArrayList<>();
        for (Vertex adjVertex : adjVertices.get(vertex)) {
            edges.add(new Edge(vertex, adjVertex));
        }
        return edges;
    }

    //returns a list of edges connected to the vertex with the given label.
    // It first gets the vertex by its label, if the vertex is not found it returns null,
    // otherwise it iterates over the list of adjacent vertices to the vertex
    // and creates an Edge object for each one and adds it to the list of edges and return it.
    public List<Edge> getEdges(int label) {
        Vertex vertex = getVertexByLabel(label);
        if (vertex == null) {
            return null;
        }
        List<Edge> edges = new ArrayList<>();
        for (Vertex adjVertex : adjVertices.get(vertex)) {
            edges.add(new Edge(vertex, adjVertex));
        }
        return edges;
    }

}
