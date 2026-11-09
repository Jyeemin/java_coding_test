package arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1118{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        int max = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;int sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
                if (i == j) {
                    sum3 += arr[i][j];
                }

            }
            sum4 += arr[i][N-1-i];

            if (sum > max) {
                max = sum;
            }
            if (sum2 > max) {
                max = sum2;
            }
            if (sum3 > max) {
                max = sum3;
            }
            if (sum4 > max) {
                max = sum4;
            }



        }
        System.out.println(max);

 }
    }

