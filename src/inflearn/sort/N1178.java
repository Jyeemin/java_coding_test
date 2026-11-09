package inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1178 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int rt = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
            rt += arr[i];
        }
        int lt = max;
        int answer = 0;


        while (lt <= rt) {
            //dvd용량기준
            int mid = (lt+rt) / 2;
            int tmp = 0;
            int cnt = 1;

            for (int i = 0; i < N; i++) {
                 tmp += arr[i];
                if (tmp > mid) {
                    cnt++;
                    tmp = arr[i];
                }
            }

            if (cnt <= M) {
                answer = mid;
                rt = mid - 1;

            } else{
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
