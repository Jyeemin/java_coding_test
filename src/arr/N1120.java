package arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1120{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] student = new int[N][5];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                student[i][j] = Integer.parseInt(str[j]);
            }
        }

        int max = -1;int answer = 1;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < 5; k++) {
                    if (student[i][k] == student[j][k]) {
                        count++;
                        break;
                    }
                    }

                }
            if (count > max) {
                max = count;
                answer=i+1;
            }

        }


        System.out.println(answer);
    }
}
