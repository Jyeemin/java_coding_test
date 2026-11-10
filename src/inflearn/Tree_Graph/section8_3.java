package inflearn.Tree_Graph;

import java.util.Scanner;

public class section8_3 {

static int sum = 1;
    static void main(String[] args) {
        //자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요
        // 5 > 120
        //5! = 5 * 4 * 3 * 2 * 1
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        DFS(N);
        System.out.println(sum);
    }

    public static void DFS(int x) {
        if (x == 1) {
            return;
        } else {
            sum *= x;
           DFS(x-1);
        }
    }
}
