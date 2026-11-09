package stack;

import java.util.Scanner;
import java.util.Stack;

class N1152{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (int i = 0; i < charArray.length; i++) {
            Character c = charArray[i];
            if (c.equals('(')) {
                stack.push(c);
            }

            if (c.equals(')')) {
                if (stack.isEmpty()) {
                    answer="NO";
                    break;
                }
                stack.pop();
            }

        }
        if (!stack.isEmpty()) {
            answer="NO";
        }


        System.out.println(answer);



            }
        }





