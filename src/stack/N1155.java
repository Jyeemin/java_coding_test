package stack;

import java.util.Scanner;
import java.util.Stack;

class N1155{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(charArray[i])) {
                int num = c - '0';
                stack.push(num);
            } else {
                Integer b = stack.pop();
                Integer a = stack.pop();
                if (c == '+') {
                    int tmp = a+b;
                    stack.push(tmp);
                }
                else if (c == '-') {
                    int tmp = a-b;
                    stack.push(tmp);

                }
                else if (c == '*') {
                    int tmp = a*b;
                    stack.push(tmp);
                }
                else {
                    int tmp = a/b;
                    stack.push(tmp);
                }
            }

        }

        System.out.println(stack.pop());

    }
}
