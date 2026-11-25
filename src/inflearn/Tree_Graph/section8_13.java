package inflearn.Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

import static inflearn.Tree_Graph.section8_11.visited;

public class section8_13 {
    static int n,m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visitied;
    static int count;

    public static void DFS(int v) {
        if(v == m) return;
        else{
            //그 값만큼 반복하고 방문처리
            if (visited[v] == 1) return;
            else {
                for (int nx : graph.get(v)) {
                      visitied[nx] = 1;
                      DFS(nx);
                      visitied[nx] = 0;
                }
            }
        }
    }



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        visitied = new int[n+1];

        for (int i = 0; i <=n ; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        visitied[1]=1;
        DFS(1);
        System.out.print(answer);

    }
}
