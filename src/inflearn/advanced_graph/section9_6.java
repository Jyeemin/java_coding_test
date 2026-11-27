package inflearn.advanced_graph;

import java.util.Arrays;
import java.util.Scanner;

public class section9_6 {
    static int[] ch;
    static int[] pick;
    static int[] visited;
    static int N, M;

    public static void DFS(int L) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(pick[i]+" ");
            }
            System.out.println();
        } else {
            int i =0;
            for (i = 0; i < N; i++) {
                if (visited[i] == 0) {
                    pick[L] =ch[i];
                    visited[i] = 1;
                    DFS(L+1);
                    visited[i] = 0;
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ch = new int[N];
        pick = new int[M];
        visited = new int[N];
        for (int i = 0; i < N; i++) {
            ch[i] = sc.nextInt();
        }
        DFS(0);
    }
}
