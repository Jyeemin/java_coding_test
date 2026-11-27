package inflearn.advanced_graph;

import java.util.Scanner;

public class section9_7 {
    static int[][] c;
    static int answer = 0;

    static public void DFS(int a, int b) {
       if(c[a][b] > 0) return;

        if(b == 0) {c[a][b] = 1;return;}
        else if (a == b) {
            c[a][b] = 1; return;
        } else {
            if (c[a][b] == 0) {
                DFS(a-1,b-1);
                DFS(a-1,b);
            }
            if (c[a - 1][b - 1] > 0 && c[a - 1][b] > 0) {
                c[a][b] = c[a-1][b-1] + c[a-1][b];
            }
        }
    }
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        //조합은 N개 중에서 R개를 순서와 상관없이 선택하는 경우의수
        c = new int[33][33];
        DFS(n,r);
        System.out.println(c[n][r]);
    }
}
