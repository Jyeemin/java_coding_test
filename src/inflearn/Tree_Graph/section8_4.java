package inflearn.Tree_Graph;

import java.util.Scanner;


public class section8_4 {
    static int index;
    static int[] arr;
    static void main(String[] args) {
        //피보나치 수열을 출력한다.
        //입력은 피보나치 수열의 총 항의 수 만약 7이면 1 1 2 3 5 8 13을 출력
        //10 > 1 1 2 3 5 8 13 21 34 55
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(DFS(i)+" ");
        }

    }

    public static int DFS(int x) {
        if (x < 3) {
            return 1;
        } else {
            return DFS(x - 1) + DFS(x - 2);

        }

    }
}
