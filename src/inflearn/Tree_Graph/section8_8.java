package inflearn.Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class section8_8 {
    static Queue<Integer> q;
    public static int BFS(int S, int E) {
        int[] ch = new int[10001];
        q = new LinkedList<>();
        q.offer(S);
        ch[S] = 1;
        int jump = 0;

        while (!q.isEmpty()) {

            int L = q.size();

            for (int i = 0; i < L; i++) {
                Integer poll = q.poll();

                if (poll == E) {
                    return jump;
                }
                int nx = poll + 5;
                if (nx <= 10000 && ch[nx] == 0) {
                    ch[nx] = 1;
                    q.offer(nx);
                }
                nx = poll +1;
                if (nx <= 10000 && ch[nx] == 0) {
                    ch[nx] = 1;
                    q.offer(nx);
                }
                nx = poll -1;
                if (nx >= 1 && ch[nx] == 0) {
                    ch[nx] = 1;
                    q.offer(nx);
                }
            }

            jump++;

        }

        return jump;
    }
    static void main(String[] args) {
        System.out.println(BFS(5,14));
    }
}
