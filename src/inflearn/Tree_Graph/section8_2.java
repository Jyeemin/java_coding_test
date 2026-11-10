package inflearn.Tree_Graph;

import java.util.Scanner;

public class section8_2 {
    static boolean started = false;

    static void main(String[] args) {
        //10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요
        // 11 > 1011
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        recursive(N,9);


    }

    public static void recursive(int n, int e) {

        if (e < 0) {
            return;
        }

        int tmp = 1;
        for (int i = 0; i < e; i++) {
            tmp *= 2;
        }
        if (tmp <= n) {
            started = true;
            System.out.print(1);
            recursive(n-tmp,--e);
        }else{
            if (started) {
                System.out.print(0);
            }
            recursive(n, --e);
        }

    }
}
