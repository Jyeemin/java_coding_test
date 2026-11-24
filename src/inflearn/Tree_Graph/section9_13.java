package inflearn.Tree_Graph;

import java.util.ArrayList;

public class section9_13 {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static int count;
    public static void DFS(int v) {
        visited[v] = 1;
        if(v == 5) count++;
        else{
            for (int i = 1; i < graph[v].size(); i++) {
                if (visited[v] == 0 && graph[v].get(i) == 1) {
                    DFS(graph[v].get(i));
                }
            }
        }
        visited[v] = 0;

    }
    static void main(String[] args) {
        count = 0;
        graph = new ArrayList[6];
        visited = new int[6];
        for (int i = 0; i < 6; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(2);
        graph[1].add(3);
        graph[1].add(4);

        graph[2].add(1);
        graph[2].add(3);
        graph[2].add(5);

        graph[3].add(4);
        graph[4].add(2);
        graph[4].add(5);

        DFS(1);
    }
}
