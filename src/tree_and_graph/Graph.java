package tree_and_graph;

import java.util.*;

public class Graph {
    Map<Vertex, List<Vertex>> adjVertices=new HashMap<>();

    void addVertex(String label) {
        Vertex v=new Vertex(label);
        List<Vertex> list= new ArrayList<Vertex>();
        boolean b=list.add(new Vertex("default"));
        System.out.println(b+"::::"+label);
        adjVertices.putIfAbsent(v,list);
        List<Vertex> newl=adjVertices.get(v);
        newl.add(new Vertex("hilu"));
        adjVertices.replace(v,newl);
        adjVertices.get(v).stream().map(ver ->ver.label).forEach(System.out::println);

    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        System.out.println(label1+"  "+label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null) {
            eV1.remove(v2);

        }
        if (eV2 != null) {
            eV2.remove(v1);
        }
    }

     static Graph createGraph() {
        Graph graph=new Graph();
        graph.addVertex("eden");
        graph.addVertex("hilina");
        graph.addVertex("bety");
        graph.addVertex("firee");
        graph.addVertex("ayniye");

         graph.adjVertices.keySet().stream().map(vers->vers.label).forEach(System.out::println);
         System.out.println("////////////////////////////");
         graph.adjVertices.get(new Vertex("eden")).stream().map(v -> v.label).forEach(System.out::println);
        // graph.adjVertices.get(new Vertex("eden")).add(new Vertex("hilina"));
         graph.addEdge("eden", "bety");
        graph.addEdge("eden", "hilina");
        graph.addEdge("bety", "ayniye");
        graph.addEdge("hilina", "ayniye");
        graph.addEdge("bety", "firee");
        graph.addEdge("hilina", "firee");

        return graph;

    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    static Set<String> DepthFirstSearch(Graph graph, String Root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<String>();
        stack.push(Root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }


        return visited;
    }


    static Set<String> BreadthFirstSearch(Graph graph, String Root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(Root);
        visited.add(Root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            if (!visited.contains(vertex)) {
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    visited.add(vertex);
                    queue.add(v.label);
                }
            }
        }


        return visited;
    }

    public  static void main(String ...args){
        Graph g= createGraph();
        System.out.println(DepthFirstSearch(g,"eden"));
        System.out.println(BreadthFirstSearch(g,"eden"));
    }
}