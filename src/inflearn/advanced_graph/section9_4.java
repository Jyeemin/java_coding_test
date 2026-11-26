package inflearn.advanced_graph;

import java.util.Scanner;

public class section9_4 {
    static int N;
    static int[] ch;
    static int M;

    public static void DFS(int m) {
        if (m == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(ch[i]+" ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                ch[m] = i;
                DFS(m+1);
            }

        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ch = new int[N];
        DFS(0);

    }
}
