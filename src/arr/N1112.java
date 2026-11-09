package arr;

import java.util.Scanner;

class N1112{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] str = sc.nextLine().split(" ");
        int score = 0;int count = 0;


        for (int i = 0; i < Integer.parseInt(N); i++) {
            if (Integer.parseInt(str[i]) == 0) {
                count = 0;
            }
            if (Integer.parseInt(str[i]) == 1) {
                count++;
            }

            score += count;
        }
        System.out.println(score);
    }
}
