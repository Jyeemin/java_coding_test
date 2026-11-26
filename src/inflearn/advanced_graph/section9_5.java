package inflearn.advanced_graph;

import java.util.Arrays;
import java.util.Scanner;

public class section9_5 {
    static int[] type;
    static int N, M, min;

    public static void DFS(int sum,int L) {
        if(L > min) return;
        if (sum == M) {
            if(L < min) min = L;
            return;
        } else {
            for (int i = N-1; i >=0; i--) {
                if (M - sum >= type[i]) {
                    DFS(sum +type[i], L +1);
                }
            }
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        type = new int[N];

        min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            type[i] = sc.nextInt();
        }
        M = sc.nextInt();
        Arrays.sort(type);
        DFS(0,0);
        System.out.println(min);
    }
}
