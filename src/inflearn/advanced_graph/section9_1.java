package inflearn.advanced_graph;

import java.util.Scanner;

public class section9_1 {
    static int[] arr;
    static int[] ch;
    static int N;
    static String answer = "NO";

    public static void DFS(int l) {
        if (l == N) {
            int sum = 0; int sub = 0;
            for (int i = 0; i < N; i++) {
                if(ch[i] == 0) sum += arr[i];
                else sub += arr[i];
            }
            if(sum == sub) answer = "YES";

        } else {
                ch[l] = 1;
                DFS(l+1);
                ch[l] = 0;
                DFS(l+1);

        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        ch = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        DFS(0);

        System.out.println(answer);
    }
}
