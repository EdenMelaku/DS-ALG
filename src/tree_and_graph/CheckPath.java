package tree_and_graph;

import java.util.*;

/*
Given a directed graph, design an algorithm to find out whether there is a route be-
tween two nodes.
 */
public class CheckPath {

    Graph2.Vertice lable1,lable2;
    public static boolean searchDFS(Graph2 g, String start, String end){
        List<String> visited=new ArrayList<>();
        Stack<String> list=new Stack<>();
        boolean found=false;
        list.push(start);
        while (!found&&!list.isEmpty()){

            String vertex=list.pop();
            if(!visited.contains(vertex)) {
                visited.add(vertex);
                for(Graph2.Vertice v:g.vertices.get(vertex).adjecentVertices){
                    if(v.lable==end) found=true;
                    list.push(v.lable);
                }
            }

        }

        return found;
    }

    public static boolean searchBFS(Graph2 g, String start, String end){
        List<String> visited=new ArrayList<>();
        Queue<String> list=new LinkedList<>();
        boolean found=false;
        list.add(start);
       // visited.add(start)
        while (!found&&!list.isEmpty()){

            String vertex=list.poll();
            for(Graph2.Vertice v:g.vertices.get(vertex).adjecentVertices){
                    if(v.lable==end) found=true;
                    if(!visited.contains(v.lable)) list.add(v.lable);
                }
            visited.add(vertex);
        }

        return found;
    }


    public static void main(String ... args){
        Graph2 graph2=Graph2.createGraph();
        System.out.println(searchBFS(graph2,"eden","dfd"));
        System.out.println(searchDFS(graph2,"eden","df"));
        System.out.println(searchBFS(graph2,"ayniye","firee"));
    }

}
