package org.example;

public class Graph {

    class Edge {
        int src, dest;
    }

    int vertices, edges;

    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            edge[i] = new Edge();
        }
    }
}
