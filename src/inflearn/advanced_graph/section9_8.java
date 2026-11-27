package inflearn.advanced_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class section9_8 {
    static int N,F;
    static int[] ch, answer, temp;
    static int[] visited;
    static boolean flag = false;


    static void DFS(int L) {
        if(flag) return;
        if (L == N) {
            temp = answer.clone();

            int len = N;

            while (len > 1) {
                    for (int i = 0; i < len - 1; i++) {
                        temp[i] = temp[i] + temp[i + 1];
                    }
                len--;
            }
            // 최종 결과가 F와 같은지 확인
            if (temp[0] == F) {
                for (int i = 0; i < N; i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(answer[i]);
                }
                System.out.println();
                flag = true;
            }

            return;
        } else {
            for (int i = 0; i < N; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    answer[L] = ch[i];
                    DFS(L+1);
                    visited[i] = 0;
                }
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();
        ch = new int[N];
        visited = new int[N];
        answer = new int[N];
        for (int i = 0; i < N; i++) {
            ch[i] = i + 1;
        }
        DFS(0);
    }
}
