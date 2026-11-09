package stack;

import java.util.ArrayDeque;
import java.util.Scanner;

class N1158{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String essential = sc.nextLine();
        String subject = sc.nextLine();
        String[] ess = essential.split("");
        String[] sub = subject.split("");

        ArrayDeque<String> queue = new ArrayDeque<>();
        int index = 0;
        for (int i = 0; i < sub.length; i++) {
            if (sub[i].equals(ess[index])) {

            }
        }

    }
}
