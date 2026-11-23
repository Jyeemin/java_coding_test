package inflearn.Tree_Graph;

import java.lang.classfile.ClassElement;

public class section8_9 {
    static class Node{
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int DFS(Node node,int level){
        if (node.lt == null && node.rt == null) {
            return level;
        } else {
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            if (node.lt != null) {
                left = DFS(node.lt, level+1);
            }
            if (node.rt != null) {
                right = DFS(node.rt, level+1);
            }
            return Math.min(left, right);
        }
    };
    static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        DFS(root, 0);
    }
}
