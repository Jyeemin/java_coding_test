package inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N1177 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = N-1;


        while(lt <= rt){
            int mid = (lt+rt) / 2;
            if (arr[mid] == M) {
                System.out.println(mid+1);
                break;
            }
            else if(arr[mid] > M){
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }


            }


        }
    }


