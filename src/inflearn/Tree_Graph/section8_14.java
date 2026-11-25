package inflearn.Tree_Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section8_14 {
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] visited;
    public static int[] dis;
    static int n,m;
    static Queue<Integer> q;
    public static void BFS(int v) {

        while (!q.isEmpty()) {
            Integer poll = q.poll(); //현재큐에서꺼냄
            //원하는정점
                for (int nx : graph.get(poll)) {
                    if (visited[nx] == 0) {
                        dis[nx] = dis[poll]+1;
                        q.offer(nx);
                        visited[nx] = 1;
                    }
                }

        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        visited = new int[n];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        q.offer(1);
        BFS(1);
    }

}
