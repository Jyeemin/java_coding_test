package arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1119{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] peaks = new int[N+2][N+2];
        for (int i = 1; i <= N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 1; j <= N; j++) {
                peaks[i][j] =Integer.parseInt(str[j-1]);
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int tmp = peaks[i][j];
                if (tmp > peaks[i - 1][j] &&
                        tmp > peaks[i + 1][j] &&
                        tmp > peaks[i][j - 1] &&
                        tmp > peaks[i][j + 1]
                ) {
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}
