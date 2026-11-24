package inflearn.Tree_Graph;

import java.sql.Array;
import java.util.ArrayList;

public class section9_11 {

    public static int[][] arr;
    public static int count;
    public static int[] visited;

    public static void DFS(int v) {
        visited[v] = 1;

        if (v == 5) {
            count++;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[v][i] == 1 && visited[i] == 0) {
                    DFS(i);
                }
            }
        }
        visited[v] = 0;
    }

    static void main(String[] args) {
        //인접행렬생성
        arr = new int[6][6];
        arr[1][2] = 1;
        arr[1][3] = 1;
        arr[1][4] = 1;

        arr[2][1] = 1;
        arr[2][3] = 1;
        arr[2][5] = 1;

        arr[3][4] = 1;
        arr[4][2] = 1;
        arr[4][5] = 1;
        //방문기록
        count = 0 ;
        visited = new int[6];
        DFS(1);
        System.out.print(count);



    }
}
