package book;

import java.util.*;

class RankComparisonSolution {
    public int[] solution(int n, int[][] comparisons) {
        int[] answer = {};

        // 여기에 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>());
        }
        int indegree[] = new int[N+1];

        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A.get(S).add(E);
            indegree[E]++;
        }

        //위상 정렬
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(indegree[i]);
            }
        }

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            for (int x: A.get(poll)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    queue.offer(x);
                }
            }
        }

        return answer;
    }
}