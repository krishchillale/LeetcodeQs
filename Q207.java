import java.util.ArrayList;

public class Q207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> [] graph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i< prerequisites.length;i++){
            int index =  prerequisites[i][1];
            graph[index].add(prerequisites[i][0]);
        }
        boolean [] vis = new boolean[numCourses];
        boolean [] path = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!vis[i]&&isCycle(graph,i,vis,path)){
                return false;
            }
        }
        return true;
    }
    public static boolean isCycle(ArrayList<Integer> [] graph,int curr, boolean [] vis,boolean [] path){
        if(vis[curr]){
            return false;
        }
        vis[curr]=true;
        path[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            int neighbour = graph[curr].get(i);
            if(path[neighbour]){
                return true;
            }
            else if(isCycle(graph, neighbour, vis, path)){
                return true;
            }
        }
        path[curr]=false;
        return false;
    }
}
