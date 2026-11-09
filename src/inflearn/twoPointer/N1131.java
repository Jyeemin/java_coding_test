package inflearn.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class N1131{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(
                br.readLine()
        );

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] S = new int[N+1];
        S[0] = 0;
        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + A[i-1];
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                if (S[j] - S[i - 1] == M) {
                    cnt++;
                }
            }
        }


        System.out.println(cnt);


    }
}
