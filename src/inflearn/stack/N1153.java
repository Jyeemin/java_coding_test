package inflearn.stack;

import java.util.Scanner;
import java.util.Stack;

class N1153{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (stack.isEmpty()) {
                if (c != '(' && c != ')') {
                    str.append(c);
                }
            }

            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                stack.pop();
            }
        }
        System.out.println(str);
    }
}
