package inflearn.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1111 {
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] reverse = new int[str.length];
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(str[i]);
            int reverseN = 0;
        //뒤집기
            while (tmp > 0) {
                int digit = tmp % 10;
                reverseN = reverseN * 10 + digit;
                tmp = tmp / 10;
            }

            reverse[i] = reverseN;
        }
        StringBuilder sb = new StringBuilder();
        //소수인지 확인
        for (int i = 0; i < N; i++) {
            for (int j = 2; j*j<=reverse[i] ; j++) {
                if (reverse[i] % j == 0) {
                    break;
                }
            }
            sb.append(reverse[i] + " ");
        }

        System.out.println(sb.toString());
    }
}
