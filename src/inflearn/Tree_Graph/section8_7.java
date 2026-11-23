package inflearn.Tree_Graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Node{
    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;

    }
}

public class section8_7 {
    static Queue<Node> q;
    public static void BFS() {
        while (!q.isEmpty()) {
            Node poll = q.poll();
            System.out.print(poll.data+ " ");
            if (poll.lt != null) q.offer(poll.lt);
            if (poll.rt != null) q.offer(poll.rt);
        }
    }
    static void main(String[] args) {
        q = new ArrayDeque<>();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        q.offer(root);
        BFS();

    }
}
