package src;

import java.util.*;

public class Main { //run the main and play with it, so you understand what is going on
    public static void main(String[] args) {


        //System.out.println(graph.getVertexByLabel(5));

        //graph.addEdge(1, 2);
        //graph.addEdge(2, 3);

       //System.out.println(graph.getAdjVertices(2));

        //List<Edge> edges = graph.getAdjVertices(2);

        //System.out.println(edges);

        //System.out.println(graph.getEdges(2));

        HexagonalGrid hexagonalgrid = new HexagonalGrid();

        System.out.println(hexagonalgrid.getEdges(21));


    }
}