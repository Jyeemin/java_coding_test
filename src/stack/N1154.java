package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class N1154{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int N = Integer.parseInt(br.readLine());
        int[][] crane = new int[N][N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                crane[i][j] = tmp;
            }

        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> doll = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            //moves[i] = 열의 번호
            int now = moves[i] - 1;
            for (int j = 0; j < N; j++) {
                if (crane[j][now] == 0) {
                    continue;
                }
                else{
                    if (!doll.isEmpty() &&
                            doll.peek() == crane[j][now]) {
                        doll.pop();
                        crane[j][now] = 0;
                        cnt += 2;
                        break;
                    }
                    int tmp = crane[j][now];
                    doll.push(tmp);
                    crane[j][now] = 0;
                    break;
                }

            }
        }

        System.out.println(cnt);
    }
}
