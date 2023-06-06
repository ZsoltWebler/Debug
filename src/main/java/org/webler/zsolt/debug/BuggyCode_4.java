package org.webler.zsolt.debug;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public void removeVertex(int vertex) {
        adjacencyList.remove(vertex);
    }

    public void removeEdge(int source, int destination) {
        if (adjacencyList.containsKey(source))
            adjacencyList.get(source).removeIf(v -> v == destination);
    }

    public List<Integer> getNeighbors(int vertex) { //TODO
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public int getVertexCount() {
        return adjacencyList.size();
    }

    public int getEdgeCount() {
        int count = 0;
        for (List<Integer> neighbors : adjacencyList.values()) {
            count += neighbors.size();
        }
        return count;
    }

    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        if (adjacencyList.containsKey(source))
            return adjacencyList.get(source).contains(destination);
        return false;
    }

    public boolean isAcyclic() {
        //TODO Return whether the graph is acyclic or not
        return false;
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}


public class BuggyCode_4 {


    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 2);
        graph.addEdge(4, 1);

        System.out.println("Graph structure:");
        graph.printGraph();

        System.out.println("Vertex count: " + graph.getVertexCount());
        System.out.println("Edge count: " + graph.getEdgeCount());

        System.out.println("Neighbors of vertex 1: " + graph.getNeighbors(1));
        System.out.println("Neighbors of vertex 4: " + graph.getNeighbors(4));

        System.out.println("Does the graph have vertex 2? " + graph.hasVertex(2));
        System.out.println("Does the graph have edge from 1 to 4? " + graph.hasEdge(1, 4));

        graph.removeEdge(2, 3);
        System.out.println("Graph structure after removing edge (2, 3):");
        graph.printGraph();

        graph.removeVertex(1);
        System.out.println("Graph structure after removing vertex 1:");
        graph.printGraph();

    }


}
