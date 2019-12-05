package tree_and_graph;

import java.util.*;

public class Graph2 {

    class Vertice{
        String lable;
        Set<Vertice> adjecentVertices;
        Vertice(String lable){
            this.lable=lable;
            adjecentVertices=new HashSet<>();
        }
        void addAdj(Vertice v){
            adjecentVertices.add(v);
        }

    }
    Map<String,Vertice> vertices;
    Graph2(){
        vertices=new HashMap();
    }

    void addVertice(String Lable){
        vertices.putIfAbsent(Lable,new Vertice(Lable));
    }
    void addEdge(String vertice1, String vertice2){
        vertices.get(vertice1).addAdj(vertices.get(vertice2));
        vertices.get(vertice2).addAdj(vertices.get(vertice1));
    }
    static Graph2 createGraph(){
        Graph2 graph=new Graph2();
        graph.addVertice("eden");
        graph.addVertice("hilina");
        graph.addVertice("bety");
        graph.addVertice("firee");
        graph.addVertice("ayniye");
        graph.addVertice("hanna");
        graph.addVertice("bubu");

        graph.addEdge("eden", "bety");
        graph.addEdge("eden", "hilina");
        graph.addEdge("bety", "ayniye");
        graph.addEdge("hilina", "ayniye");
        graph.addEdge("bety", "firee");
        graph.addEdge("hilina", "firee");
        graph.addEdge("hanna", "bubu");
        graph.addEdge("bety", "bubu");

        return graph;
    }

    static Set<String> DepthFirstSearch(Graph2 graph, String Root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(Root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertice v : graph.vertices.get(vertex).adjecentVertices) {
                    stack.push(v.lable);
                }
            }
        }


        return visited;
    }


    static Set<String> BreadthFirstSearch(Graph2 graph, String Root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(Root);
        visited.add(Root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
              for (Vertice v : graph.vertices.get(vertex).adjecentVertices) {
                    if (!visited.contains(v.lable)) {
                    visited.add(v.lable);
                    queue.add(v.lable);
                }
            }
        }


        return visited;
    }

    public  static void main(String ...args){
        Graph2 g= createGraph();
        System.out.println(DepthFirstSearch(g,"eden"));
        System.out.println(BreadthFirstSearch(g,"eden"));
    }
}
