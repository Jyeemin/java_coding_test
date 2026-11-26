package inflearn.advanced_graph;

import java.util.Scanner;

public class section9_2 {
    static int N, C, max;
    static int[] ch;

    public static void DFS(int l,int hap) {
        if (l == N) {
            if(hap > max && hap < C) max = hap;
        } else {
            DFS(l+1, hap+ch[l]);
            DFS(l+1, hap);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();

        ch = new int[N];
        for (int i = 0; i < N; i++) {
            ch[i] = sc.nextInt();
        }
        max = Integer.MIN_VALUE;

        DFS(0,0);
        System.out.println(max);

    }
}
