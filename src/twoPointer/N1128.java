package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class N1128{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        //Main T = new Main();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        StringTokenizer st =
                new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
           arr2[i] =  Integer.parseInt(st.nextToken());
        }
        int[] arr3 = new int[N+M];
        int index = 0;
        int A = 0; int B = 0;
        while(A<N &&  B<M){
            if (arr1[A] > arr2[B]) {
                arr3[index++] = arr2[B++];

            }else{
                arr3[index++] = arr1[A++];
            }

        }

        // 첫 번째 배열에 남은 원소 넣기
        while (A < N) {
            arr3[index++] = arr1[A++];
        }

// 두 번째 배열에 남은 원소 넣기
        while (B < M) {
            arr3[index++] = arr2[B++];
        }

        for (int i = 0; i < N+M; i++) {
            System.out.print(arr3[i] + " ");

        }


    }
}
