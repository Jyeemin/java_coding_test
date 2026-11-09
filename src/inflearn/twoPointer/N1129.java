package inflearn.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class N1129{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st =
                new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }


        List<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr1[i] == arr2[j] && !arr3.contains(arr1[i])) {
                    arr3.add(arr1[i]);
                }
            }
        }

        Collections.sort(arr3);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr3.size(); i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(arr3.get(i));
        }

        System.out.print(sb);
    }
}
