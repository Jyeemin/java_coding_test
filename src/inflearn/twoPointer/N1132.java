package inflearn.twoPointer;

import java.util.Scanner;

class N1132{
    public int solution(){
        return 0;
    }

    public static void main(String[] args) {
        //Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int lt=1; int rt=1; int cnt = 0;int sum = 0;
        while (lt<N) {
            if (sum == N) {
                cnt++;
            }

            if (sum < N) {
                sum += rt;
                rt++;


            }else{
                sum -= lt;
                lt++;

            }

        }

        System.out.println(cnt);
    }
}
