package inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[N-1] - arr[0];
        int answer = 0;

        int mid = 0;

        while (lt <= rt) {
            mid = (lt+rt)/2;
            int tmp = arr[0];
            int cnt = C - 1;
            //mid의 거리로 말 넣어보기
            for (int i = 1; i < arr.length; i++) {
                    if (arr[i] - tmp >= mid) {
                        tmp = arr[i];
                        cnt--;
                        if (cnt == 0) {
                            break;
                        }
                    }

            }
            if (cnt <= 0) {
                answer = mid;
                lt = mid+1;
            } else{
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
