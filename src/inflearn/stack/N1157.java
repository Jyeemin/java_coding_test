package inflearn.stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class N1157{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int index = 1;
        while (queue.size() > 1) {
            if (index != K) {
                Integer poll = queue.poll();
                queue.offer(poll);
                index++;
            } else {
                queue.poll();
                index = 1;
            }
        }

        System.out.println(queue.poll());

    }
}
