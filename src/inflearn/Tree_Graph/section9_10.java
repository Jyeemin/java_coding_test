package inflearn.Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class section9_10 {
    static class Node{
        int data;
        Node lt;
        Node rt;

        public Node(int Data) {
            this.data = Data;
        }
    }

    public static int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        int answer = 0;
        while (!q.isEmpty()) {
            int L = q.size();

            for (int i = 0; i < L; i++) {
                Node poll = q.poll();
                if (poll.lt == null && poll.rt == null) {
                    answer = level;
                }
                if (poll.lt != null) q.offer(poll.lt);
                if (poll.rt != null) q.offer(poll.rt);
            }
            level++;
        }

        return answer;
    }

    static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.print(BFS(root));
    }
}
