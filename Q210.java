import java.util.ArrayList;
import java.util.Stack;

public class Q210 {
    class edge{
        int neighbour;
        public edge(int neighbour){
            this.neighbour=neighbour;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<edge> [] graph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int index = prerequisites[i][1];
            graph[index].add(new edge(prerequisites[i][0]));
        }
        if(isCycle(graph)){
            return new int [0];
        }
        Stack<Integer> s = new Stack<>();
        boolean [] vis = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                topo(graph,i,s,vis);
            }
        }
        int [] result = new int [numCourses];
        for(int i=0;i<numCourses;i++){
            result[i]=s.pop();
        }
        return result;
    }
    public static boolean isCycle(ArrayList<edge> [] graph){
        boolean [] vis = new boolean[graph.length];
        boolean [] path = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            if(!vis[i]){
                if(utilDfs(graph,i,vis,path)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void topo(ArrayList<edge> [] graph, int curr,Stack<Integer> s,boolean [] vis){
        if(vis[curr]){
            return;
        }
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int neighbour = graph[curr].get(i).neighbour;
            topo(graph, neighbour, s, vis);
        }
        s.push(curr);
    }
    public static boolean utilDfs(ArrayList<edge> [] graph, int curr,boolean[] vis,boolean [] path){
        if(vis[curr]){
            return false;
        }
        vis[curr]=true;
        path[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int neigbour = graph[curr].get(i).neighbour;
            if(path[neigbour]){
                return true;
            }
            if(utilDfs(graph, neigbour, vis, path)){
                return true;
            }
        }
        path[curr]=false;
        return false;
    }
}
