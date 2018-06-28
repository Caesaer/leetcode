import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No802 {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++)
            dfs(graph, visited, list, i, i);
        Collections.sort(list);

        return list;
    }

    public void dfs(int[][] graph, boolean[] visited, List<Integer> ret, int pre, int i){
        if (visited[i])
            return;

        if (graph[i].length == 0){
            if (!ret.contains(pre)) ret.add(pre);
            if (!ret.contains(i)) ret.add(i);
            return;
        }
        for (int j = 0; j < graph[i].length; j++){
            if (graph[i][j] > i) {
                visited[i] = true;
                dfs(graph, visited, ret, i, graph[i][j]);
            }
        }
    }

    public static void main(String[] args){
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(new No802().eventualSafeNodes(graph));
    }
}
