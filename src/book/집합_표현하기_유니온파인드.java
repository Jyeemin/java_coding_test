package book;

import java.util.ArrayList;
import java.util.HashMap;

class UnionFindSolution {
    static ArrayList<ArrayList<Integer>> A;
    static ArrayList<Integer> answer;
    public String[] solution(int n, int[][] operations) {

        String[] answer = new String[3];

        int index =0;
        HashMap<String,Integer> hm = new HashMap<>();

        // 여기에 코드를 작성해 봐!
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < operations.length; i++) {
            if(operations[i][0] == 1){ //합집합
                union(operations[i][1], operations[i][2], arr);
            }else{ //0 같은 집합에 포함되어잇나?
                int x = find(operations[i][1], arr);
                int y = find(operations[i][2], arr);
                if (x == y) {
                    answer[index++] += "YES\n";
                } else {
                    answer[index++] += "NO\n";
                }
            }
        }

        return answer;
    }

    public int find(int a, int[] arr) {
        if (arr[a] == a) {
            return a;
        } else {
            return arr[a] = find(arr[a], arr);
        }
    }

    public void union(int a, int b, int[] arr){
        int x = find(a, arr);
        int y = find(b, arr);

        if (x > y) {
            arr[y] = x;
        } else {
            arr[x] = y;
        }
    }

    public static void main(String[] args) {
        UnionFindSolution s = new UnionFindSolution();

        int n = 7;
        int[][] operations = {
                {0, 1, 3},
                {1, 1, 7},
                {0, 7, 6},
                {1, 7, 1},
                {0, 3, 7},
                {0, 4, 2},
                {0, 1, 1},
                {1, 1, 1}
        };

        String[] result = s.solution(n, operations);

        for (String answer : result) {
            System.out.println(answer);
        }
    }
}