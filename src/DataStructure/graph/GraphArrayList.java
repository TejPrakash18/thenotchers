package DataStructure.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Graph{
    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    Graph(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i <=vertices ; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdges(int u, int v, boolean dir){
        adjList.get(u).add(v);
        if(!dir){
            adjList.get(v).add(u);
        }
    }

    public void printGraph(){
        for(int i =0; i<=vertices; i++){
            System.out.println(i + " -> " + adjList.get(i));
        }
        System.out.println();
    }
}
public class GraphArrayList {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdges(0,1,false);
        g.addEdges(1,2, false);
        g.addEdges(1,3,false);
        g.addEdges(2,3,false);
        g.addEdges(2,4,false);
        System.out.println("UnDirected Graph");
        g.printGraph();


        System.out.println("Directed Graph");
        Graph g1 = new Graph(4);
        g1.addEdges(0,1, true);
        g1.addEdges(1,2, true);
        g1.addEdges(2,3, true);
        g1.addEdges(2,4, true);
        g1.addEdges(3,5, true);
        g1.addEdges(4,5,true);


        g1.printGraph();
    }

}
