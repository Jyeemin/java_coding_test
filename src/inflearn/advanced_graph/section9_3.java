package inflearn.advanced_graph;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class section9_3 {

    static int N, M ,sum;// 제한시간
    static int[] time;
    static int[] score;

    public static void DFS(int l, int t,int s) {
        if(t > M) return;
        if(s > sum) sum = s;
        if (l == N) {
            return;
        } else {
            DFS(l+1, t+time[l],s+score[l]);
            DFS(l+1, t, s);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();


        score = new int[N];
        time = new int[N];
        sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();

        }

        DFS(0,0,0);
        System.out.println(sum);

    }
}
