package arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class N1108{
    public String solution(int a, int b){
        if (a == b) {
            return "D";
        }
        int s = 1; //가위
        int r = 2; //바위
        int p = 3; //보
        if (a == s && b == p) {
            return "A";
        }
        if (a == r && b == s) {
            return "A";
        }
        if (a == p && b == r) {
            return "A";
        }
        return "B";
    }

    public static void main(String[] args) throws IOException {
        N1108 T = new N1108();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            System.out.println(T.solution(
                    Integer.parseInt(A[i]), Integer.parseInt(B[i])));
        }


    }
}
